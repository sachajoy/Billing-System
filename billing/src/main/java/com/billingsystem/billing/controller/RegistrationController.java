package com.billingsystem.billing.controller;

import com.billingsystem.billing.beans.User;
import com.billingsystem.billing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/registeruser")
    public String registerUser(@Valid @ModelAttribute("newuser") User user, BindingResult bindingResult, Model model){
        System.out.println("Regiter User");

        if(bindingResult.hasErrors()){
            return "register";
        }

        userRepository.save(user);
        model.addAttribute("dataSaved", "User registered Successfully");
        return "login";
    }
}
