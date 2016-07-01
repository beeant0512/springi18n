package com.beeant.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiaobiao on 16/7/1.
 */
@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("index")
    public String index(Model model){
        return "index";
    }
}
