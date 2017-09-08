package com.cz.library.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("")
public class IndexController {


    @GetMapping("")
    public ModelAndView index() {
        ModelAndView view = new ModelAndView("index");
        view.addObject("title", "hello");
        view.addObject("content", "nihao");

        return view;
    }

}
