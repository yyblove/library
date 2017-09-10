package com.thymeleaf.library.controller;


import com.thymeleaf.library.mybatis.*;
import com.thymeleaf.library.vo.MyModeView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class SystemController {

    @Autowired
    LibraryMapper libraryMapper;

    @Autowired
    ManagerMapper managerMapper;

    @Autowired
    ParameterMapper parameterMapper;

    @Autowired
    BookcaseMapper bookcaseMapper;

    @GetMapping("/library")
    public ModelAndView doGetLibrary() {
        ModelAndView view = new ModelAndView("index");
        view.addObject("view", "library");
        Library library = libraryMapper.selectAll().get(0);
        view.addObject("content", library);
        return view;
    }


    @GetMapping("/manager")
    public MyModeView doGetManager() {
        MyModeView myModeView = new MyModeView("manager");
        List<Manager> managerList = managerMapper.selectAll();
        myModeView.setContent(managerList);
        return myModeView;
    }

    @GetMapping("/parameter")
    public MyModeView doGetParameter() {
        MyModeView myModeView = new MyModeView("parameter");
        Parameter parameter = parameterMapper.selectAll().get(0);
        myModeView.setContent(parameter);
        return myModeView;
    }

    @GetMapping("/bookcase")
    public MyModeView doGetBookcase() {
        MyModeView myModeView = new MyModeView("bookcase");
        List<Bookcase> bookcaseList = bookcaseMapper.selectAll();
        myModeView.setContent(bookcaseList);
        return myModeView;
    }
}
