package pl.jrola.trainings.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by JrQ- on 2016-04-07.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String home() {
        return "I'm here";
    }

}
