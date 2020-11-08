package com.licenta.Smartmix;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmartmixHomepage {

    @RequestMapping("/homepage")
    public String homepage() {
        return "Homepage";
    }
}
