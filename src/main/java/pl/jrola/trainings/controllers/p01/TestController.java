package pl.jrola.trainings.controllers.p01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.jrola.trainings.beans.RequestScopeBean;
import pl.jrola.trainings.beans.SessionScopeBean;
import pl.jrola.trainings.dtos.Project;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by JrQ- on 2016-04-27.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/methods", method = RequestMethod.GET)
    public String addView() {
        return "test";
    }

    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    public String exceptionTest() {

        if (true)
            throw new RuntimeException();

        return "it does not matter! : )";
    }

    @RequestMapping(value = "/go", method = RequestMethod.GET)
    public String test(Model model, HttpServletRequest request) {
        model.addAttribute("controllerName", "TestController.test");
        model.addAttribute("params", request.getParameter("param"));
        return "test";
    }

    @RequestMapping(value = "/go", method = RequestMethod.POST, params = {"type=param01"})
    public String test2(Model model, @RequestParam(value = "type") String type) {
        model.addAttribute("controllerName", "TestController.test2");
        model.addAttribute("params", type);
        return "test";
    }

    @RequestMapping(value = "/go", method = RequestMethod.POST, params = {"type=param01", "special"})
    public String test3(Model model, HttpServletRequest request) {
        model.addAttribute("controllerName", "TestController.test3");
        model.addAttribute("params", request.getParameter("type") + ", " + request.getParameter("special"));
        return "test";
    }

    @RequestMapping(value = "/go", method = RequestMethod.POST)
    public String test4(Model model, HttpServletRequest request) {
        model.addAttribute("controllerName", "TestController.test4");
        model.addAttribute("params", request.getParameterMap());
        return "test";
    }

    @RequestMapping(value = "/xmlViewResolver", method=RequestMethod.GET)
    public String testXmlResolver() {
        return "xml_resolver";
    }

    @RequestMapping(value = "/redirect")
    public String testRedirect(RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("redirectAttribute", "Redirection happened");
        return "redirect:/servlet01/home";
    }

    @RequestMapping(value = "/redirectWithFlashAttribute")
    public String testRedirectWithFlashAttribute(RedirectAttributes redirectAttributes) {
        Project project = new Project();
        project.setId(1L);
        project.setName("Flash Project");
        project.setDesc("Flash Project Description");

        redirectAttributes.addFlashAttribute("redirectFlashAttribute", project);
        return "redirect:/servlet01/home2";
    }

    @Autowired
    private RequestScopeBean requestScopeBean;

    @Autowired
    private SessionScopeBean sessionScopeBean;

    @RequestMapping(value = "/scope", method = RequestMethod.GET)
    public String testScope(Model model) {

        int requestScopeBeanCounter = requestScopeBean.incrementCounter();
        int sessionScopeBeanCounter = sessionScopeBean.incrementCounter();

        System.out.println("RequestScopeBean counter: " + requestScopeBeanCounter);
        System.out.println("SessionScopeBean counter: " + sessionScopeBeanCounter);

        model.addAttribute("requestScopeBeanCounter", requestScopeBeanCounter);
        model.addAttribute("sessionScopeBeanCounter", sessionScopeBeanCounter);

        return "scope";
    }

    @RequestMapping("/json")
    @ResponseBody
    public Project testJson() {

        Project project = new Project();
        project.setId(1L);
        project.setName("Project Name");
        project.setDesc("Project Description");

        return project;
    }

    @RequestMapping(value = "/converter", method = RequestMethod.GET)
    public String testConverter1() {
        return "converter";
    }

    @RequestMapping(value = "/converter", method = RequestMethod.POST)
    public String testConverter2(Model model, @RequestParam Project project) {

        System.out.println("Converted from string: " + project);
        model.addAttribute("project", project);

        return "converter";
    }

}