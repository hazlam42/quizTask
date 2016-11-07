package ru.innopolis;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * This controller is responsible for viewing respective page in dependence of the user role
 */
@Controller
public class ViewController {

    @Secured(value = {"ROLE_ADMIN"})
    @RequestMapping("/Admin")
    public ModelAndView viewAdm(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Admin");
        return modelAndView;
    }

    @Secured(value = {"ROLE_USER"})
    @RequestMapping("/User")
    public ModelAndView viewUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("User");
        return modelAndView;
    }

    @Secured(value = {"ROLE_ADMIN","ROLE_USER"})
    @RequestMapping("/home")
    public ModelAndView viewHome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }
}
