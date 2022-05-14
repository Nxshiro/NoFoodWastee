package com.nofoodwaste.app.Register;

import com.nofoodwaste.app.User.IUser;
import com.nofoodwaste.app.User.Shop;
import com.nofoodwaste.app.User.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

public class HomeController {

    @PostMapping("/home")
    public String login(@ModelAttribute User userForm, HttpSession session){

        return "home";
    }
    @GetMapping("/home")
    public String login(Model model){
        model.addAttribute("shopForm",new Shop());
        return "home";
    }
}
