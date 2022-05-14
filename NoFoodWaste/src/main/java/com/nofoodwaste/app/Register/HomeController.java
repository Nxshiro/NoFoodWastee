package com.nofoodwaste.app.Register;

import com.nofoodwaste.app.User.IShop;
import com.nofoodwaste.app.User.IUser;
import com.nofoodwaste.app.User.Shop;
import com.nofoodwaste.app.User.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
@AllArgsConstructor
public class HomeController {

    private IShop shopRepo;
    @PostMapping("/home")
    public String login(@ModelAttribute User userForm, HttpSession session){

        return "home";
    }
    @GetMapping("/home")
    public String login(Model model){
        model.addAttribute("shop",shopRepo.findAll());

        return "home";
    }
}
