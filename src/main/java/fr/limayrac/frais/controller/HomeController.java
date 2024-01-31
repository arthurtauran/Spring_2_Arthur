package fr.limayrac.frais.controller;

import fr.limayrac.frais.model.User;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
    @GetMapping("Connexion")
    public String Connexion(Model model) {
      model.addAttribute("message", "Bonjour, ");
        return "Connexion";
    }

    @PostMapping("/process_register")
    public String proceesRegister(User user){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = PasswordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        logger.info(user.toString());
        userRespo(user);

        return "register_success";
    }
    @RequestMapping(method = RequestMethod.GET, value = "DetailFormation")
    public String DetailFormation(Model model) {
        //  model.addAttribute("message", "Bonjour, ");
        return "DetailFormation";
    }

    @RequestMapping(method = RequestMethod.GET, value = "Hebergement")
    public String Hebergement(Model model) {
   //     model.addAttribute("message", "Bonjour, ");
        return "Hebergement";
    }

    @RequestMapping(method = RequestMethod.GET, value = "Restauration")
    public String restauration(Model model) {
        model.addAttribute("message", "Bonjour, ");
        return "Restauration";
    }

    @RequestMapping(method = RequestMethod.GET, value = "Transport")
    public String Transport(Model model) {
      //  model.addAttribute("message", "Bonjour, ");
        return "Transport";
    }


    @RequestMapping(method = RequestMethod.GET, value = "CoordonneesBancaire")
    public String CoordonneesBancaire(Model model) {
        model.addAttribute("message", "Bonjour, ");
        return "CoordonneesBancaire";
    }
}
