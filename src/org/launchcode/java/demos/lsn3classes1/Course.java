package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private Teacher instructor;
    private ArrayList<Student> roster;

    public Course(String courseName) {
        this.courseName = courseName;
        this.instructor = new Teacher();
        this.roster = new ArrayList<Student>();
    }

    public Course(String courseName, Teacher instructor){
        this.courseName = courseName;
        this.instructor = instructor;
        this.roster = new ArrayList<Student>();
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public void setRoster(ArrayList<Student> roster) {
        this.roster = roster;
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }
}
