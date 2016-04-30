package pl.jrola.trainings.dtos;

import java.util.List;

/**
 * Created by JrQ- on 2016-04-25.
 */
public class Project {

    private Long id;
    private String name;
    private String desc;
    private Integer peopleInvolved;
    private Boolean finished;
    private List<String> indicators;

    public Project() {
    }

    public Project(Long id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getPeopleInvolved() {
        return peopleInvolved;
    }

    public void setPeopleInvolved(Integer peopleInvolved) {
        this.peopleInvolved = peopleInvolved;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public List<String> getIndicators() {
        return indicators;
    }

    public void setIndicators(List<String> indicators) {
        this.indicators = indicators;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", peopleInvolved=" + peopleInvolved +
                ", finished=" + finished +
                ", indicators=" + indicators +
                '}';
    }
}
