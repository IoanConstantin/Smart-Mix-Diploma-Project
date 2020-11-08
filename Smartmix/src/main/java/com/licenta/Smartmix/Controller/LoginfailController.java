package com.licenta.Smartmix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginfailController {
    @RequestMapping("/login-failed")
    public String getLoginfail() {
        return "loginfail";
    }
}
