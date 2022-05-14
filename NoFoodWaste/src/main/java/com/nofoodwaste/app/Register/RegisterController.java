package com.nofoodwaste.app.Register;

import com.nofoodwaste.app.User.IUser;
import com.nofoodwaste.app.User.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.concurrent.atomic.AtomicReference;

@Controller
@AllArgsConstructor
public class RegisterController {

    private IUser userRepo;

    @PostMapping("/register")
    public String register(Model model, @ModelAttribute User userForm, HttpSession session){
        if(userRepo.findByEmail(userForm.getEmail()).isPresent()){
           model.addAttribute("erreurMail","Email déjà utilisé");
           return ("register");
        }

        return "login";
    }
    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("userForm",new User());
        return "register";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User userForm, HttpSession session){
        User actif = userRepo.findByEmailAndPassword(userForm.getEmail(), userForm.getPassword());
        if(actif!=null){
            session.setAttribute("user", actif);
        }
        return "home";
    }
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("userForm",new User());
        return "login";
    }
}