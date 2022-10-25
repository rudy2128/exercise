package fullstack.example.exercise.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String code;
    private String name;
    private String address;

    private String phone;
    @ManyToMany(mappedBy = "suppliers")
    private Set<Product> products;

    public Supplier() {
    }

    public Supplier(Integer id, String code, String name, String address, String phone) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}
