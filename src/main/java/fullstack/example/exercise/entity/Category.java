package fullstack.example.exercise.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String code;
    private String name;

    public Category() {
    }

    public Category(Integer id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }
}
