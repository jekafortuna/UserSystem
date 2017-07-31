package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import system.model.User;
import system.service.UserService;

import java.util.List;

/**
 * Created by Evgeniy on 28.07.2017.
 * Controller element of MVC pattern
 */

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/validate", method = RequestMethod.GET)
    public ModelAndView validateUser(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("UserFromServer", new User());
        modelAndView.setViewName("users_check_page");
        return modelAndView;
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public @ResponseBody String checkUser(@ModelAttribute("UserFromServer") User user){
        if ("admin".equals(user.getLogin()) && "admin".equals(user.getPassword())){
            return "valid user";
        } else return "invalid user";
    }
}
