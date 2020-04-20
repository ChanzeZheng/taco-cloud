package cn.chanze.tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 说明：简单的控制器类处理对根路径（“/”）的请求，并将这些请求转发至主页视图
 * Create By Chanze on 2020/4/18.
 */
@Controller             //控制器
public class HomeController {

    @GetMapping("/")    //处理对根路径“/”的请求
    public String home(){
        return "home";          //返回视图名
    }

}
