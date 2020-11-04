package com.quiz.controllers;

import com.quiz.entities.User;
import com.quiz.services.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserCtrl {
    @Autowired
    private IUserService userService;

    @GetMapping("/{id}")
    public ModelAndView get(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customer", new User());
        return modelAndView;
    }
    @GetMapping
    public ModelAndView get(){
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customer", new User());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@RequestBody User p){
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        modelAndView.addObject("customer", new User());
        return modelAndView;
    }
}
