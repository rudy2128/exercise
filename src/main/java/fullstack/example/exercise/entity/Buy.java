package fullstack.example.exercise.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private Date date;
    private String code;
    private String category;
    private String name;
    private String supplier;
    private Integer qty;
    private Double hpp;
    private Double total;


    public Buy() {
    }

    public Buy(Long id, Date date, String code, String category, String name, String supplier, Integer qty, Double hpp, Double total) {
        this.id = id;
        this.date = date;
        this.code = code;
        this.category = category;
        this.name = name;
        this.supplier = supplier;
        this.qty = qty;
        this.hpp = hpp;
        this.total = total;
    }

}
