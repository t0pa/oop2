package org.example.week11.t1;

public class Student {

    private int ID;
    private String name;
    private String university;
    private String department;
    private double gpa;


    public Student(int ID, String name, String university, String department, double gpa) {
        this.ID = ID;
        this.name = name;
        this.university = university;
        this.department = department;
        this.gpa = gpa;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return getName();
    }


}
