package com.kou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author JIAJUN KOU
 */
@Controller
public class HelloController {

    /**
     * 求情映射注解
     * @return
     */
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("王妃你好.....");
        return "success";
    }

}
