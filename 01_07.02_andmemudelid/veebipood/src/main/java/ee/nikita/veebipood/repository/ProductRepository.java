package ee.nikita.veebipood.repository;

import ee.nikita.veebipood.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByCategory_Id(Long id, Pageable pageable);
}