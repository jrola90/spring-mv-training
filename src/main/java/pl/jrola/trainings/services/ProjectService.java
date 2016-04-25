package pl.jrola.trainings.services;

import org.springframework.stereotype.Service;
import pl.jrola.trainings.dtos.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JrQ- on 2016-04-25.
 */
@Service
public class ProjectService {

    public List<Project> getProjects() {

        List<Project> list = new ArrayList<Project>();

        Project p1 = new Project(1L, "NAME_1");
        list.add(p1);

        Project p2 = new Project(2L, "NAME_2");
        list.add(p2);

        return list;
    }
}
