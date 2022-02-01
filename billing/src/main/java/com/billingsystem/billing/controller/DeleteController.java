package com.billingsystem.billing.controller;

import com.billingsystem.billing.beans.Product;
import com.billingsystem.billing.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DeleteController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping ("/delete")
    public String delete(@RequestParam("delete") String delete, Model model){
        System.out.println("In delete Controller");
        System.out.println("delete Param: "+delete);

        List<Product> products = productRepository.deleteById();
        model.addAttribute("products", products);
        return "delete";
    }

}

