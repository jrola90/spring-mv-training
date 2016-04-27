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

        Project p1 = new Project(1L, "Project number 1", "Very long description of first project");
        projects.add(p1);

        Project p2 = new Project(2L, "Second project", "Short desc of second");
        projects.add(p2);
    }

    public void addProject(Project project) {
        long calculatedId = calculateId();

        if (project == null)
            projects = new ArrayList<Project>();

        project.setId(calculatedId);
        projects.add(project);
    }

    private long calculateId() {
        long id = 1L;

        if (projects != null)
            id = projects.size() + 1;

        return id;
    }

    public List<Project> getProjects() {
        return projects;
    }
}
