package com.licenta.Smartmix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoogleMapsHattrickController {
        @RequestMapping(value = "/google-maps-cel-mai-ieftin", method = RequestMethod.GET)
        public String getGoogleMapsHattrick() {
            return "google-maps-cel-mai-ieftin";
        }
}
