package pl.jrola.trainings.controllers.p01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by JrQ- on 2016-04-07.
 */
@Controller
@RequestMapping
public class HomeController {

    @RequestMapping(value = "/home")
    public String home() {
        return "home";
    }


}
