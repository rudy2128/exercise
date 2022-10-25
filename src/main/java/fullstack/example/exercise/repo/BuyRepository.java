package fullstack.example.exercise.repo;

import fullstack.example.exercise.entity.Buy;
import fullstack.example.exercise.entity.Product;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BuyRepository extends CrudRepository<Buy,Long> {

    List<Buy> findByNameContains(String keyword);
}
