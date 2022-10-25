package fullstack.example.exercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class SupplierController {

    @GetMapping("/supplier")
    public String supplier(){
        return "supplier";
    }
}
