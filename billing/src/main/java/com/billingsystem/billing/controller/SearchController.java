package com.billingsystem.billing.controller;

import com.billingsystem.billing.beans.Product;
import com.billingsystem.billing.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/search")
    public String search(@RequestParam("search") String search, Model model){
        System.out.println("In search Contoller");
        System.out.println("Search Param: " + search);
        List<Product> products = productRepository.searchByName(search);
        model.addAttribute("products", products);
        return "search";
    }

}
