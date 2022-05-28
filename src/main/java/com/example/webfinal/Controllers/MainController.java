package com.example.webfinal.Controllers;

import com.example.webfinal.Entity.Product;
import com.example.webfinal.Repo.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private productRepo ProductRepo;

    @GetMapping("/")
    public String main(Model model){
        Iterable<Product> products = ProductRepo.findAll();
        model.addAttribute("products",products);
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }

}
