package org.example.week4.people;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private int student_id;
    private List<Integer> grades;
    private int points=0;

    public Student(String name,String street,int student_id) {
        super(name,street);
        this.student_id=student_id;
        this.grades= new ArrayList<Integer>();
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void addGrade(int grade){

        if (grade >=0 && grade<=100)
            grades.add(grade);
        else
            System.out.println("Wrong grade");
    }

    public int credits(){
        return points;
    }

    public void study(){
        points++;
    }

    public String toString(){
        return getName()+"\n"+getStreet() + "\n" + credits() + "\n" + grades;
    }

}
