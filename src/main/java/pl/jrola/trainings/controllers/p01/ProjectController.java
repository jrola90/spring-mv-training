package pl.jrola.trainings.controllers.p01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.jrola.trainings.dtos.Project;
import pl.jrola.trainings.services.ProjectService;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by JrQ- on 2016-04-17.
 */
@Controller
@RequestMapping(value = "project")
@SessionAttributes("project")
public class ProjectController {

    @Autowired
    private ProjectService service;

    @RequestMapping(value = "/list/", method = RequestMethod.GET)
    public String findProjects(Model model) {
        model.addAttribute("projects", service.getProjects());
        return "projects";
    }

    @RequestMapping(value = "/details/{projectId}", method = RequestMethod.GET)
    public String showProjectDetails(Model model, @PathVariable Long projectId) {
        model.addAttribute("project", service.find(projectId));
        return "project_details";
    }

    @RequestMapping(value = "/add/", method = RequestMethod.GET)
    public String addProjectView() {
        return "add";
    }

    @RequestMapping(value = "/add/", method = RequestMethod.POST)
    public String addProject(Model model, @ModelAttribute Project project) {
        service.addProject(project);
        model.addAttribute("result", "Project was added successfully");
        return "add";
    }

    @RequestMapping(value = "/add2/", method = RequestMethod.GET)
    public String addProjectView2(Model model) {
        model.addAttribute("project", new Project());
        return "add2";
    }

    @RequestMapping(value = "/add2/", method = RequestMethod.POST)
    public String addProject2(@ModelAttribute Project project) {
        System.out.println("You are trying to add item: " + project);
        return "review";
    }

    @RequestMapping(value = "/review/", method = RequestMethod.GET)
    public String review(@ModelAttribute Project project) {
        return "review";
    }

    @RequestMapping(value = "/confirm/", method = RequestMethod.POST)
    public String confirm(Model model, @ModelAttribute Project project) {
        service.addProject(project);
        model.addAttribute("project", new Project());
        return "redirect:/servlet01/project/details/" + project.getId();
    }

    @RequestMapping(value="/request/", method = RequestMethod.POST)
    @ResponseBody
    public String request() {
        return "Request has been sent";
    }

    @ModelAttribute("indicatorsOptions")
    public List<String> indicatorsOptions() {
        return new LinkedList<String>(Arrays.asList(new String[]{"AVP", "VP", "SVP"}));
    }

    @ModelAttribute("peopleInvolvedOptions")
    public List<Integer> peopleInvolvedOptions() {
        return new LinkedList<Integer>(Arrays.asList(new Integer[]{
                1, 2, 3, 4}));
    }

}