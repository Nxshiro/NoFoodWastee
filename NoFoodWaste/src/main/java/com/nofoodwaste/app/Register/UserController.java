package com.nofoodwaste.app.Register;

import com.nofoodwaste.app.User.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

public class UserController {

    @PostMapping("/profil")
    public String register(HttpSession session){

        return "profil";
    }
    @GetMapping("/profil")
    public String register(HttpSession session){

        return "profil";
    }
}
