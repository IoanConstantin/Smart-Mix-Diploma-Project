package com.licenta.Smartmix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoogleMapsController {
    // Get Google Maps Page
    @RequestMapping(value = "/google-maps", method = RequestMethod.GET)
    public String getGoogleMaps() {
        return "google-maps";
    }
}
