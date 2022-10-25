package fullstack.example.exercise.controllers;

import fullstack.example.exercise.dto.SearchFromData;
import fullstack.example.exercise.entity.Product;
import fullstack.example.exercise.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    ProductService productService;

    @GetMapping("")
    public String home(){
        return "index";
    }

    @GetMapping("/stock")
    public String welcome(Model model){
        model.addAttribute("searchForm",new SearchFromData());
        model.addAttribute("products",productService.findAll());
        return "stock";

    }
    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("product",new Product());
        return "add";
    }

    @PostMapping("/save")
    public String save(Product product,Model model){
        productService.addProduct(product);
        return "redirect:/stock";
    }
    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable("id")Long id){
        productService.deleteById(id);
        return "redirect:/stock";

    }
    @GetMapping("edit/{id}")
    public String editById(@PathVariable("id")Long id,Model model){
        model.addAttribute("products",productService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(Product product,Model model){
        productService.addProduct(product);
        return "redirect:/stock";
    }
    @PostMapping("/search")
    public String search(SearchFromData searchFromData,Model model){
        model.addAttribute("searchForm",searchFromData);
        model.addAttribute("products",productService.findByName(searchFromData.getKeyword()));
        return "stock";

    }

}
