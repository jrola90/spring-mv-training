package pl.jrola.trainings.controllers.p01;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by JrQ- on 2016-08-14.
 */
@ControllerAdvice(assignableTypes = {ControllerAdviceTest1Controller.class, ControllerAdviceTest2Controller.class})
public class GenericController {

    @ModelAttribute(value = "exampleModel")
    public String getExampleModel() {
        return "test value";
    }

}