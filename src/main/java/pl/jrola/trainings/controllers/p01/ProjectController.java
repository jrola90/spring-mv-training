package pl.jrola.trainings.controllers.p01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.jrola.trainings.services.ProjectService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by JrQ- on 2016-04-17.
 */
@Controller
@RequestMapping(value = "project")
public class ProjectController {

    @Autowired
    private ProjectService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String addView() {
        return "add";
    }

    @RequestMapping(value = "/add/", method = RequestMethod.GET)
    public String addProject(Model model, HttpServletRequest request) {
        model.addAttribute("controllerName", "ProjectController.addProject");
        model.addAttribute("params", request.getParameter("param"));
        return "add";
    }

    @RequestMapping(value = "/add/", method = RequestMethod.POST, params = {"type=param01"})
    public String addProject2(Model model, @RequestParam(value = "type") String type) {
        model.addAttribute("controllerName", "ProjectController.addProject2");
        model.addAttribute("params", type);
        return "add";
    }

    @RequestMapping(value = "/add/", method = RequestMethod.POST, params = {"type=param01", "special"})
    public String addProject3(Model model, HttpServletRequest request) {
        model.addAttribute("controllerName", "ProjectController.addProject3");
        model.addAttribute("params", request.getParameter("type") + ", " + request.getParameter("special"));
        return "add";
    }

    @RequestMapping(value = "/add/", method = RequestMethod.POST)
    public String addProject4(Model model, HttpServletRequest request) {
        model.addAttribute("controllerName", "ProjectController.addProject4");
        model.addAttribute("params", request.getParameterMap());
        return "add";
    }

    @RequestMapping(value= "/find/", method = RequestMethod.GET)
    public String findProjects(Model model) {
        model.addAttribute("projects", service.getProjects());
        return "projects";
    }

}
