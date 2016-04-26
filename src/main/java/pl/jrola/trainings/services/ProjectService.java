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
        List<Project> LIST = new ArrayList<Project>();

        Project p1 = new Project(1L, "NAME_1");
        LIST.add(p1);

        Project p2 = new Project(2L, "NAME_2");
        LIST.add(p2);

        return LIST;
    }

    public Project find(Long id) {

        List<Project> LIST = new ArrayList<Project>();

        Project p1 = new Project(1L, "NAME_1");
        LIST.add(p1);

        Project p2 = new Project(2L, "NAME_2");
        LIST.add(p2);

        Project ret = null;

        for (Project item : LIST) {
            if (item.getId() == id) {
                ret = item;
            }
        }

        return ret;
    }
}
