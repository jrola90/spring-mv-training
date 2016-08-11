package pl.jrola.trainings.controllers.p01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/home", params="redirectAttribute")
    public String homeWithRedirection(Model model, @RequestParam String redirectAttribute) {
        model.addAttribute("redirectAttribute", redirectAttribute);
        return "home";
    }

}