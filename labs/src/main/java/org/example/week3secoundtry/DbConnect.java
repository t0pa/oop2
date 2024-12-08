package org.example.week3secoundtry;

import java.sql.*;

public class DbConnect {
   private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
   private static final String  USERNAME="root";
   private static final String PASSWORD="root";

   Connection connection=null;

   public DbConnect(){
       try{
           connection=DriverManager.getConnection(CONNECTION_STRING,USERNAME,PASSWORD);
       }
       catch (SQLException e){
           throw new RuntimeException(e);
       }

   }


   public void updateSomethign(int id, String name, Status status) throws SQLException{

       PreparedStatement statement=connection.prepareStatement(
               "update tasks set task_description=?,task_status=? where id=?"
       );

       statement.setString(1,name);
       statement.setString(2,status.toString());
       statement.setInt(3,id);

       int affectedRows = statement.executeUpdate();

       if (affectedRows>0){
           System.out.println("row is updated");
       }else {
           System.out.println("id doesnt exist");
       }


   }

}



