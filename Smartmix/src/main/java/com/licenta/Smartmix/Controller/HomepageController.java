package com.licenta.Smartmix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomepageController {

    @RequestMapping(value = "/acasa", method = RequestMethod.GET)
    public String getHomepage() {
            return "homepage";
        }

}
