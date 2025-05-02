package ee.nikita.veebipood.controller;


import ee.nikita.veebipood.entity.Order;
import ee.nikita.veebipood.entity.Product;
import ee.nikita.veebipood.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("orders")
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    @PostMapping("orders")
    public List<Order> addOrder(@RequestBody Order order) {
        order.setCreated(new Date());
        double sum = 0;
        for (Product p: order.getProducts()) {
            sum += p.getPrice();
        }
        order.setTotalSum(sum);
        orderRepository.save(order);
        return orderRepository.findAll();
    }
}
