package com.beeant.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Beeant on 2016/7/1.
 */
@Controller("/demo")
@RequestMapping("demo")
public class IndexController {
    @RequestMapping("index")
    public String index(Model model){
        return "demo/index";
    }
}
