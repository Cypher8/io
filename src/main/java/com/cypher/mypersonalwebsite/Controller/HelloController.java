package com.cypher.mypersonalwebsite.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description：TODO
 * @author     ：庄斌裕
 * @date       ：2024/7/9 16:37
 * @version    ：1.0.0
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "forward:index.html";
    }
}