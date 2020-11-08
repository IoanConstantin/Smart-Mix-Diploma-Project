package com.licenta.Smartmix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReteteApreciateSecundarController {

    @RequestMapping(value = "/retete-apreciate-faina-ulei-oua-mozzarella", method = RequestMethod.GET)
    public String getReteteApreciateSecundar() {
        return "retete-apreciate-faina-ulei-oua-mozzarella";
    }
}
