package pl.jrola.trainings.controllers.p01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by JrQ- on 2016-08-14.
 */
@Controller
@RequestMapping("ctrlAdvice01")
public class ControllerAdviceTest1Controller {

    @RequestMapping("/test")
    public String test() {
        return "ctrl_advice";
    }

}
