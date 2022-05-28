package com.example.webfinal.Controllers;

import com.example.webfinal.Entity.Product;
import com.example.webfinal.Repo.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WomenProductController {

    @Autowired
    private productRepo ProductRepo;

    @GetMapping("/women")
    public String getWomenProduct(Model model){
        Iterable<Product> products = ProductRepo.findAllByTypesAndSex("Clothes","Women");
        Iterable<Product> shoes = ProductRepo.findAllByTypesAndSex("Shoes","Women");
        Iterable<Product> carousel = ProductRepo.findAllByTypesAndSex("carousel","Women");
        model.addAttribute("products",products);
        model.addAttribute("shoes",shoes);
        model.addAttribute("carousel",carousel);
        return "women";
    }

}
