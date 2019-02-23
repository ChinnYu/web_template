package com.jason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springmvc_all_try
 * @description:
 * @author: Liu
 * @create: 2018-10-06
 */
@Controller
public class IndexController {
/**
 *  @author : Liu 
 *  @Date : 2019/2/23
 *  @Description :
 */
    @RequestMapping("/")
    public String home(){
        return "home/index";
    }
}
