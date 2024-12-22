package org.example.week11.t1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentSystem {

    List<Student> students;


    public StudentSystem(String filepath) throws IOException {

        List<Student> Newlist = new ArrayList<>();

        try (BufferedReader reader= new BufferedReader(new FileReader(filepath))){

            String line;

            while ((line=reader.readLine())!=null) {
                String[] details = line.split(",");
                int id = Integer.parseInt(details[0]);
                String name = details[1];
                String uni= details[2];
                String department= details[3];
                double GPA = Double.parseDouble(details[4]);


                Newlist.add(new Student(id,name,uni,department,GPA));
            }

        }
        this.students=Newlist;

    }



    public StudentSystem(List<Student> students){
        this.students=students;
    }

    public Optional<Student> getStudentsById(int id){
        for (Student student : this.students){
             if (student.getID() == id){
                 return Optional.of(student);
             }
        }
        return Optional.empty();
    }

    public Student HighestGpa(){
        if (students.isEmpty() || students.size() == 0 ){
            throw new EmptyStudentListException("prazna kume");
        }


        Student student2 = students.get(0);
        for (Student student: students){
            if (student.getGpa() > student2.getGpa()){

                student2=student;
            }
        }


        return student2;
    }

    private void validateStudentData(List<Student> students) throws InvalidStudentDataException{

        for (Student student: students){
            if (student.getGpa()>=6 || student.getGpa()<=10){

            }
            else {
                throw new InvalidStudentDataException("Nemere ti bit manje od 6");
            }

        }
    }



}



