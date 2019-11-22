package com.abcedu.ssm.sys.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: Test01
 * @description:
 * @author: Every
 * @create: 2019-11-16 16:03
 **/
@Controller
public class VIewController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/add")
    public String add() {
        return "add";
    }

    @RequestMapping("/update")
    public String list() {
        return "update";
    }
}

