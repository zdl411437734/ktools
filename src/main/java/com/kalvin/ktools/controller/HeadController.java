package com.kalvin.ktools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 头像 控制层
 */
@RestController
@RequestMapping(value = "head")
public class HeadController {

    @GetMapping(value = "")
    public ModelAndView index() {
        return new ModelAndView("head/head.html");
    }
}
