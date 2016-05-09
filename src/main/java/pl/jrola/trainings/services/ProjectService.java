package pl.jrola.trainings.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jrola.trainings.daos.ProjectsDao;
import pl.jrola.trainings.dtos.Project;
import pl.jrola.trainings.exceptions.ProjectNotFoundException;

import java.util.List;

/**
 * Created by JrQ- on 2016-04-25.
 */
@Service
public class ProjectService {

    @Autowired
    private ProjectsDao dao;

    public List<Project> getProjects() {
        return dao.getProjects();
    }

    public Project find(Long id) {

        Project project = null;
        List<Project> projects = dao.getProjects();

        for (Project item : projects) {
            if (item.getId() == id) {
                project = item;
            }
        }

        if (project == null)
            throw new ProjectNotFoundException("Project with ID = " + id + " was not found.");

        return project;
    }

    public void addProject(Project project) {
        dao.addProject(project);
    }

}
