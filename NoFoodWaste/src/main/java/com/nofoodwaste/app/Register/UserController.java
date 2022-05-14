package com.nofoodwaste.app.Register;

import com.nofoodwaste.app.User.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
@AllArgsConstructor
public class UserController {

    @PostMapping("/profil")
    public String profil(HttpSession session){

        return "profil";
    }
    @GetMapping("/profil")
    public String profil(HttpSession session){

        return "profil";
    }
}
