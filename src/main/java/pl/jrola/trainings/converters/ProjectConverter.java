package pl.jrola.trainings.converters;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.convert.converter.Converter;
import pl.jrola.trainings.dtos.Project;

/**
 * Created by JrQ- on 2016-08-15.
 */
public class ProjectConverter implements Converter<String, Project> {

    /**
     * Converts string to Project.
     * @param projectString format: id#name#desc
     * @return project
     */
    public Project convert(String projectString) {

        Project project = null;

        if(StringUtils.isNotBlank(projectString)) {
            String[] properties = projectString.split("#");
            if(properties.length == 3) {
                project = new Project();
                project.setId(new Long(properties[0]));
                project.setName(properties[1]);
                project.setDesc(properties[2]);
            }
        }

        return project;
    }
}
