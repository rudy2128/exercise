package fullstack.example.exercise.service;

import fullstack.example.exercise.entity.Buy;
import fullstack.example.exercise.entity.Sell;
import fullstack.example.exercise.repo.BuyRepository;
import fullstack.example.exercise.repo.SellRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class SellService {
    @Autowired
    SellRepository sellRepository;
    public Iterable<Sell> findAll(){
        return sellRepository.findAll();
    }
    public void addSell(Sell sell){
        sellRepository.save(sell);
    }
    public void deleteById(Long id){
        sellRepository.deleteById(id);
    }
    public Optional<Sell> findById(Long id){
        return sellRepository.findById(id);
    }
    public void updateById(Sell sell){
        sellRepository.save(sell);
    }
    public List<Sell> findByName(String keyword){
        return sellRepository.findByNameContains(keyword);
    }
}
