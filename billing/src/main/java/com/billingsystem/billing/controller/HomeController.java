package com.billingsystem.billing.controller;

import com.billingsystem.billing.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome(){
        System.out.println("in home controller");
        return "index";
    }
    @GetMapping("/product")
    public String goToProduct(){
        System.out.println("goToProduct");
        return "listProduct";
    }
    @GetMapping("/showForm")
    public String showForm(){
        System.out.println("showForm");
        return "product-form";
    }
    @GetMapping("/goToSearch")
    public String goToSearch(){
        System.out.println("goToSearch");
        return "search";
    }
    @GetMapping("/goToLogin")
    public String goToLogin(){
        System.out.println("goToLogin");
        return "login";
    }
    @GetMapping("/goToRegistration")
    public String goToRegistration(){
        System.out.println("goToSearch");
        return "register";
    }

    @ModelAttribute("newuser")
    public User getDefaultUser(){
        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems(){
        return Arrays.asList("Male", "Female", "Others");
    }

}
