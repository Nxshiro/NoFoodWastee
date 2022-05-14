package com.nofoodwaste.app.Register;

import com.nofoodwaste.app.User.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {



    @PostMapping("register")
    public String register(){

        return "login";
    }
    @GetMapping("register")
    public String register(Model model){
        model.addAttribute("userForm",new User());
        return "register";
    }

    @PostMapping("login")
    public String login(){

        return "login";
    }
    @GetMapping("login")
    public String login(Model model){
        model.addAttribute("username",new User());
        model.addAttribute("mdp",new User());
        return "login";
    }
}
