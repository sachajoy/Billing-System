package com.billingsystem.billing.controller;

import com.billingsystem.billing.beans.User;
import com.billingsystem.billing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    UserRepository userRepository;

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Date.class, "dateOfBirth",
                new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true)
        );
    }

    @GetMapping("/listUser")
    public String listUser(Model model){
        System.out.println("list user");
        List<User> userList = userRepository.findAll();
        model.addAttribute("userList", userList);
        return "listUser";
    }

    @GetMapping("/udpateUser/{id}")
    public String updateUser(@PathVariable int id, Model model){
        System.out.println("update user");
        User user = userRepository.findById(id).get();
        System.out.println(user.getUsername());
        model.addAttribute("userDetails", user);
        return "udpateUser";
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems(){
        return Arrays.asList("Male", "Female", "Others");
    }

    @PostMapping("/updateUserDetails")
    public String updateUserDetails(@ModelAttribute("userDetails") User user, BindingResult bindingResult,
                                    Model model){
        if(bindingResult.hasErrors()){
            return "updateUser";
        }
        userRepository.save(user);
        return "redirect:listUser";
    }

}
