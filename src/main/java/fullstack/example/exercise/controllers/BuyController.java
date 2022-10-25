package fullstack.example.exercise.controllers;

import fullstack.example.exercise.dto.SearchFromData;
import fullstack.example.exercise.entity.Buy;
import fullstack.example.exercise.entity.Product;
import fullstack.example.exercise.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class BuyController {
    @Autowired
    BuyService buyService;

    @GetMapping("/buy")
    public String findAll(Model model){
        model.addAttribute("searchForm",new SearchFromData());
        model.addAttribute("buys",buyService.findAll());
        return "buy";

    }
    @GetMapping("/add-buy")
    public String add(Model model){
        model.addAttribute("buy",new Buy());
        return "add-buy";
    }
    @PostMapping("/save-buy")
    public String save(Buy buy,Model model){
        buyService.addBuy(buy);
        return "redirect:/buy";
    }

}
