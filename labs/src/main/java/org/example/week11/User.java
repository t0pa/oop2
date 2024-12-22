package org.example.week11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class PasswordTooShort extends Exception{
    public PasswordTooShort(String message){
        super(message);
    }
}


public class User {

    private String username;
    private String password;
    private int id;
    private String Email;

    public User(String username, String password, int id, String Email) throws PasswordTooShort {
        this.Email=Email;
        this.username=username;
        setPassword(password);
        this.id=id;

    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordTooShort {
        if (password.length() < 5){
            throw new PasswordTooShort("Your password is too short dude");
        }else
            this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void writeToFile() throws IOException {
       try {

           BufferedWriter writer= new BufferedWriter(new FileWriter("userDetails.txt"));
           writer.write(getUsername());
           writer.newLine();
           writer.write(getPassword());
           writer.newLine();
           writer.close();  
       } catch (IOException e) {
          e.printStackTrace();
       }


    }



}

class Main {
    public static void main(String[] args) throws PasswordTooShort,IOException {
        User user = new User("Tarik","12345",1,"topicatrik82@gmail.com");

        user.writeToFile();

    }

}
