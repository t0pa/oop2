package org.example.week11;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test

    void writeToFile() throws Exception {

        User user = new User("john_doe", "password123", 1, "john@example.com");

        user.writeToFile();

        try(BufferedReader reader = new BufferedReader(new FileReader("userDetails.txt"))){

                assertEquals("john_doe",reader.readLine(),"Not good username");
                assertEquals("password123" ,reader.readLine(), "bad pasw");
                assertNull(reader.readLine());
        }


    }
}