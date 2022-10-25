package fullstack.example.exercise.service;

import fullstack.example.exercise.entity.Buy;
import fullstack.example.exercise.entity.Product;
import fullstack.example.exercise.repo.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BuyService {
    @Autowired
    BuyRepository buyRepository;
    public Iterable<Buy> findAll(){
        return buyRepository.findAll();
    }
    public void addBuy(Buy buy){
        buyRepository.save(buy);
    }
    public void deleteById(Long id){
        buyRepository.deleteById(id);
    }
    public Optional<Buy> findById(Long id){
        return buyRepository.findById(id);
    }
    public void updateById(Buy buy){
        buyRepository.save(buy);
    }
    public List<Buy> findByName(String keyword){
        return buyRepository.findByNameContains(keyword);
    }
}
