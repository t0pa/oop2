package org.example.week3secoundtry;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", Status.TO_DO),
                new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED));
    }

    // TODO create a method to get all objects
public List<TaskItem> getAllObjects(){
      return tasks;
}

    // TODO create a method getByStatus that will accept a Status parameter and filter the tasks with the provided status
public List<TaskItem> getByStatus(Status status){
        List<TaskItem> newList= new ArrayList<>();
        for (TaskItem item : tasks){
            if (item.getTaskStatus()==status)
                 newList.add(item);
        }
        return newList;
}
    // TODO create a method to find tasks whose id parameter greater than or equal to 2

    public List<TaskItem> getbiggerorequalthantwo(){
        List<TaskItem> newList= new ArrayList<>();
        for (TaskItem item : tasks){
            if (item.getTaskId()>=2)
                newList.add(item);
        }
        return newList;
    }


    // TODO create a method that will, by using the forEach stream method, print to the console the description of each task

    public void description(){
        for (TaskItem item : tasks){
            System.out.println(item.getTaskDescription());
        }

    }

    public static void main (String[] args) throws SQLException {
        DbConnect db1= new DbConnect();

        db1.updateSomethign(2,"Alomala",Status.COMPLETED);

    }

}

