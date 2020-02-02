package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
   // @OneToOne
    @NotBlank(message="Location should not be empty or null!")
    @Size(min = 2, max= 30)
    private String location;

    @OneToMany
    @JoinColumn(name="employer_id")
    private final List<Job> jobs=new ArrayList<>();

    public Employer() {
    }
    public Employer(String location){
        this.location=location;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
