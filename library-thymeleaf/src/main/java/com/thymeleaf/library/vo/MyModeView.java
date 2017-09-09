package com.thymeleaf.library.vo;

import org.springframework.web.servlet.ModelAndView;

public class MyModeView extends ModelAndView{

    public MyModeView(){
        this(null, null, null);
    }

    public MyModeView(String view){
       this(view, null, null);
    }

    public MyModeView(String view, String title){
        this(view, title, null);
    }

    public MyModeView(String view, String title, String username){
        super(view);
    }

    public void setMsg(Msg msg) {
        super.addObject("msg", msg);
    }
}
