package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills;
    //private final List<Skill> skills = new ArrayList<>();
    // private String skills;

    public Job() {
    }

    public Job(Employer employer, List<Skill> skills) {
        this.employer = employer;
        this.skills = skills;
    }
//    public Job(Employer employer,Skill skills) {
//        super();
//        this.employer = employer;
//        this.skills=skills;
//    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
//
//    public void setSkills(List<Skill> someskill){
//      for(Skill askill : someskill)
//        this.skills.add((Skill) askill;
//    }
//    private List<Person> listPeople = new ArrayList<Person>();
 //private final List<Skill> skills = new ArrayList<>();
//    public void setListPeople(List<Person> list) {
//        for (Person aPerson : list) {
//            this.listPeople.add((Person) aPerson.clone());
//        }

}
