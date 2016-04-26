package pl.jrola.trainings.daos;

import org.springframework.stereotype.Repository;
import pl.jrola.trainings.dtos.Project;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JrQ- on 2016-04-27.
 */
@Repository
public class ProjectsDao {

    private List<Project> projects;

    @PostConstruct
    public void init() {
        projects = new ArrayList<Project>();

        Project p1 = new Project(1L, "Project number 1");
        projects.add(p1);

        Project p2 = new Project(2L, "Second project");
        projects.add(p2);
    }

    public List<Project> getProjects() {
        return projects;
    }
}
