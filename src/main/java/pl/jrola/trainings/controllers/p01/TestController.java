package pl.jrola.trainings.controllers.p01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

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

}
