package fullstack.example.exercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @GetMapping
    public String product(Model model){
        String speak = "Please Speak what do you want Rudy!!";
        model.addAttribute("sp",speak);
        return "product";

    }


}
