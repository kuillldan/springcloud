package org.lyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yuankliu on 05/04/2018.
 */
@Controller
@RequestMapping("/HelloController/")
public class HelloController
{
    @ResponseBody
    @RequestMapping("echo")
    public Object echo(String msg)
    {
        System.out.println("receve msg:" + msg);
        return "Hello(echo 001):" + msg.toUpperCase();
    }
}
