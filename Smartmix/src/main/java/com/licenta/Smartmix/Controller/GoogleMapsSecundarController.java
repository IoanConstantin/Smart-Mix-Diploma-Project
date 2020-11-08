package com.licenta.Smartmix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoogleMapsSecundarController {
    @RequestMapping(value = "/google-maps-cel-mai-scurt", method = RequestMethod.GET)
    public String getGoogleMapsSecundar() {
        return "google-maps-cel-mai-scurt";
    }
}
