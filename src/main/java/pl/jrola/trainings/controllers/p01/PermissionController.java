package pl.jrola.trainings.controllers.p01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by JrQ- on 2016-05-02.
 */
@Controller
@RequestMapping(value = "permission")
public class PermissionController {

    @RequestMapping(value="/request/", method = RequestMethod.POST)
    @ResponseBody
    public String request(@RequestBody String date) {
        return "Request has been sent, date = " + date;
    }

}
