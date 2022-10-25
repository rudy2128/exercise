package fullstack.example.exercise.repo;

import fullstack.example.exercise.entity.Product;
import fullstack.example.exercise.entity.Sell;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SellRepository extends CrudRepository<Sell,Long> {
    List<Sell> findByNameContains(String keyword);
}
