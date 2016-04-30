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

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by JrQ- on 2016-04-17.
 */
@Controller
@RequestMapping(value = "project")
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
        initView(model);
        model.addAttribute("project", new Project());
        return "add2";
    }

    @RequestMapping(value = "/add2/", method = RequestMethod.POST)
    public String addProject2(Model model, @ModelAttribute Project project) {
        service.addProject(project);
        model.addAttribute("result", "Project was added successfully");

        initView(model);
        return "add2";
    }

    private static final List<Integer> PEOPLE_INVOLVED = new LinkedList<Integer>(Arrays.asList(new Integer[]{
            1, 2, 3, 4}));
    private static final List<String> INDICATORS_OPTIONS = new LinkedList<String>(Arrays.asList(new String[]{"AVP", "VP", "SVP"}));
    private void initView(Model model) {
        if (model != null) {
            model.addAttribute("peopleInvolvedOptions", PEOPLE_INVOLVED);
            model.addAttribute("indicatorsOptions", INDICATORS_OPTIONS);
        }
    }

}