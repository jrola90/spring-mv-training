package pl.jrola.trainings.controllers.p01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by JrQ- on 2016-04-07.
 */
@Controller
@RequestMapping(value="project")
public class HomeController {

    @RequestMapping(value = "/home")
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addView() {
        return "add";
    }

    @RequestMapping(value = "/add/project", method = RequestMethod.GET)
    public String addProject() {
        System.out.println("HomeController.addProject");
        return "add";
    }

    @RequestMapping(value = "/add/project", method = RequestMethod.POST, params = {"type=param01"})
    public String addProject2() {
        System.out.println("HomeController.addProject2");
        return "add";
    }

    @RequestMapping(value = "/add/project", method = RequestMethod.POST, params = {"type=param01", "special"})
    public String addProject3() {
        System.out.println("HomeController.addProject3");
        return "add";
    }
}
