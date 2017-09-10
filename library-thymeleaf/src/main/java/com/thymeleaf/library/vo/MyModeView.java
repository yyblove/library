package com.thymeleaf.library.vo;

import org.springframework.web.servlet.ModelAndView;

public class MyModeView extends ModelAndView {

    public MyModeView(String view, Object content) {
        super("index");
        super.addObject("view", view);
        super.addObject("content", content);
    }

    public MyModeView(String view) {
        this(view, null);
    }

    public MyModeView(){
        this("index");
    }

    public void setContent(Object content) {
        super.addObject("content", content);
    }

    public void setMsg(Msg msg){
        super.addObject("msg", msg);
    }

    public void setView(String view){
        super.addObject("view", view);
    }


}
