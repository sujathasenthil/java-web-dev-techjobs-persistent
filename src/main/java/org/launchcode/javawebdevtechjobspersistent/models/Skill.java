package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @Size(max= 500, message="Description is too Long!")
    private String description;

//    private final List<Job> jobs=new ArrayList<>();

    public Skill() {
    }
    public Skill(String description){
        this.description=description;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}