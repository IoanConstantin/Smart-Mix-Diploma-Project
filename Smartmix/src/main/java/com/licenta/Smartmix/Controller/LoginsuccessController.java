package com.licenta.Smartmix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginsuccessController {

    @RequestMapping("/login-successful")
    public String getLoginsuccess() {
        return "loginsuccess";
    }
}
