package com.licenta.Smartmix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MozzarellaSticksController {
    @RequestMapping(value = "/mozzarella-sticks", method = RequestMethod.GET)
    public String getMozzarellaSticks() {
        return "mozzarella-sticks";
    }
}
