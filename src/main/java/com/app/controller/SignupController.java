package com.app.controller;

import com.app.model.User;
import com.app.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signup")
public class SignupController {
    private final UserService userService;

    public SignupController(UserService userService){
        this.userService = userService;
    }

    @GetMapping()
    public String signupView(){return "signup";}

    @PostMapping()
    public String signup(@ModelAttribute User user, Model model){
        String signupError = null;

        if (!userService.isEmailAvailable(user.getEmail())){
            signupError = "The username already exists";
        }

        if (signupError == null && !userService.createUser(user)){
            signupError = "There was an error signing you up. Please try again.";
        }

        if (signupError == null){
            model.addAttribute("signupSuccess", true);
            return "redirect:/login?signupSuccess";
        }else{
            model.addAttribute("signupError", signupError);
            return "signup";
        }
    }
}
