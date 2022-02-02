package com.billingsystem.billing.controller;
import com.billingsystem.billing.beans.Product;
import com.billingsystem.billing.exception.ResourceNotFoundException;
import com.billingsystem.billing.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/listProduct")
    public String listProduct(Model model){
        System.out.println("list product");
        //List<Product> productList = (List<Product>) productRepository.findAll();
        model.addAttribute("productList", productRepository.findAll());
        return "listProduct";
    }

    @GetMapping("/showForm")
    public String showProductForAdd(Model model){
        System.out.println("Show Form");
        Product product = new Product();
//        System.out.println(product.getName());
        model.addAttribute("productDetails", product);
        return "product-form";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product){
        productRepository.save(product);
        return "redirect:/listProduct";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("productId") int id,
                                    Model model)throws ResourceNotFoundException {
        Product product = productRepository.findById(id).get();
        System.out.println(product.getName());
        model.addAttribute("product", product);
        return "product-form";
    }

    @GetMapping("/delete")
    public String deleteProduct(@RequestParam("productId") int id) throws ResourceNotFoundException{
        productRepository.deleteById(id);
        return "redirect:/listProduct";
    }
//
}