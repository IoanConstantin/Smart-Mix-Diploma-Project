package com.licenta.Smartmix.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReteteApreciateController {

    @RequestMapping(value = "/retete-apreciate", method = RequestMethod.GET)
    public String getReteteApreciate() {
            return "retete-apreciate";
        }
}
