package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max= 500, message="Description is too Long!")
    private String description;

   @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs=new ArrayList<>();
//    private jobs
    public Skill() {
    }
    public Skill(String description){
        super();
        this.description=description;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}