package pl.jrola.trainings.controllers.p01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.jrola.trainings.dtos.Project;

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

    @RequestMapping(value = "/home2")
    public String homeWithRedirectionWithFlashAttributes(Model model, @ModelAttribute(value = "redirectFlashAttribute") Project project) {
        model.addAttribute("redirectAttribute", project);
        return "home";
    }

}