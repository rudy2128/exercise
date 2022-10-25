package fullstack.example.exercise.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Sell {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String date;
    private String code;
    private String category;
    private String name;
    private String supplier;
    private Integer qty;
    private Double hpp;
    private Double price;
    private Double total;
    private Double profit ;

}
