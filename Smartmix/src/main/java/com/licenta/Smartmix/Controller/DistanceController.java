package com.licenta.Smartmix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DistanceController {
    // Get Distance Controller Page
    @RequestMapping(value = "/distance", method = RequestMethod.GET)
    public String getDistance() {
        return "distance";
    }
}
