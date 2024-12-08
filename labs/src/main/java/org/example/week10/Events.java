package org.example.week10;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Events {
    private static final String[] EVENT_TYPES = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    private static final Random RANDOM = new Random();

    public void generateEventsFile(String filename, int records) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (int i = 0; i < records; i++) {
                String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                String eventType = EVENT_TYPES[RANDOM.nextInt(EVENT_TYPES.length)];
                int userId = RANDOM.nextInt(1000);
                writer.println(timestamp + " | Event Type: " + eventType + " | User ID: " + userId);
            }
        }
    }

    public void printEventsFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            reader.lines().forEach(System.out::println);
        }
    }

    public List<String> readEventsFromFile(String filename) throws IOException {
        List<String> events = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                events.add(line);
            }
        }
        return events;
    }

    public static void main(String[] args) throws IOException {
        Events events = new Events();
        String filename = "events.txt";
        events.generateEventsFile(filename, 10);
        events.printEventsFromFile(filename);
        List<String> eventRecords = events.readEventsFromFile(filename);
        System.out.println("Retrieved " + eventRecords.size() + " events.");
    }
}
