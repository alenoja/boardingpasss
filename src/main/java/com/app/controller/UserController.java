package com.app.controller;

import com.app.model.User;

import com.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
//This is to allow calls from React... NOT IMPORTANT RIGHT NOW
@CrossOrigin(origins = { "http://localhost:3000"})

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/addUserPage")
    public ModelAndView addUserPage(){
        User user = new User();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userForm", user);
        modelAndView.setViewName("create-project");
        return modelAndView;
    }

    @PostMapping("/addUser")
    public ModelAndView addCustomer(@ModelAttribute User user) {

        userService.createUser(user);
        return new ModelAndView("redirect:/addDestinationPage");
    }


    @GetMapping("/lists")
    public ModelAndView userList(){

        ModelAndView model =new ModelAndView();
        List<User> userList = userService.getAllUser();
        model.addObject("userLists",userList);
        model.setViewName("customer_list");
        return model;
    }


}
