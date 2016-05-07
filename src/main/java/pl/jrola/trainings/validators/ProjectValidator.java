package pl.jrola.trainings.validators;

import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import pl.jrola.trainings.dtos.Project;

/**
 * Created by JrQ- on 2016-05-07.
 */
public class ProjectValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return Project.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {

        Project project = (Project) o;

        if (StringUtils.isBlank(project.getName())) {
            errors.rejectValue("name", "project.name", "Name is mandatory");
        }


    }
}
