package ee.nikita.veebipood.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String image; // .jpg
    private boolean active;

    @ManyToOne
    private Category category;

//    public void setPrice(double price) {
//        this.price = price;
//        System.out.println("Kasutaja xxx muutis hinda. ID: " + this.id);
//    }
}
