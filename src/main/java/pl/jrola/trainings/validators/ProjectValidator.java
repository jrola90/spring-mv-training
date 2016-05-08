package pl.jrola.trainings.validators;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import pl.jrola.trainings.dtos.Project;

import javax.validation.ParameterNameProvider;
import javax.validation.executable.ExecutableValidator;

/**
 * Created by JrQ- on 2016-05-07.
 */
@Component
public class ProjectValidator extends LocalValidatorFactoryBean implements Validator {
    public boolean supports(Class<?> aClass) {
        return Project.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {

        super.validate(o, errors);

        Project project = (Project) o;

        if (StringUtils.isBlank(project.getName())) {
            errors.rejectValue("name", "project.name", "Name is mandatory");
        }

    }

    public ExecutableValidator forExecutables() {
        return null;
    }

    public ParameterNameProvider getParameterNameProvider() {
        return null;
    }

    public void close() {

    }
}
