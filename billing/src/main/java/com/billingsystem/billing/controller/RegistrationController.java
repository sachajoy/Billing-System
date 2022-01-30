package com.billingsystem.billing.controller;

import com.billingsystem.billing.beans.User;
import com.billingsystem.billing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/registeruser")
    public String registerUser(@ModelAttribute("newuser") User user){
        System.out.println("Regiter User");
        userRepository.save(user);
        return "login";
    }
}
