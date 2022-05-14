package com.nofoodwaste.app.Register;

import com.nofoodwaste.app.User.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

    @GetMapping
    public String register(Model model){
        model.addAttribute("username",new User());
        return "register";
    }
}
