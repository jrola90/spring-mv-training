package pl.jrola.trainings.controllers.p01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.jrola.trainings.dtos.Project;
import pl.jrola.trainings.services.ProjectService;

/**
 * Created by JrQ- on 2016-04-17.
 */
@Controller
@RequestMapping(value = "project")
public class ProjectController {

    @Autowired
    private ProjectService service;

    @RequestMapping(value= "/list/", method = RequestMethod.GET)
    public String findProjects(Model model) {
        model.addAttribute("projects", service.getProjects());
        return "projects";
    }

    @RequestMapping(value= "/details/{projectId}", method = RequestMethod.GET)
    public String showProjectDetails(Model model, @PathVariable Long projectId) {
        model.addAttribute("project", service.find(projectId));
        return "project_details";
    }

    @RequestMapping(value="/add/", method = RequestMethod.GET)
    public String addProjectView() {
        return "add";
    }

    @RequestMapping(value="/add/", method = RequestMethod.POST)
    public String addProject(Model model, @ModelAttribute Project project) {
        service.addProject(project);
        model.addAttribute("result", "Project was added successfully");
        return "add";
    }

}
