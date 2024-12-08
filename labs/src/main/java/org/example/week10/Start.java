package org.example.week10;

import java.lang.reflect.*;
import java.util.*;

public class Start {
    static class Student {
        private String name;
        private String ID;
        private List<Integer> grades;

        public Student(String name, String ID, List<Integer> grades) {
            this.name = name;
            this.ID = ID;
            this.grades = grades;
        }

        public void printInfo() {
            System.out.println("ID: " + ID + ", Name: " + name + ", Grades: " + grades);
        }
    }

    static class GradeAnalyzer {
        private List<Integer> grades;

        public GradeAnalyzer(List<Integer> grades) {
            this.grades = grades;
        }

        public double calculateAverage() {
            return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        }

        public void printSummary() {
            System.out.println("Grade Summary: " + grades);
        }
    }

    public static void main(String[] args) throws Exception {
        Student student = new Student("Alice", "S123", Arrays.asList(85, 90, 78));
        GradeAnalyzer analyzer = new GradeAnalyzer(Arrays.asList(85, 90, 78));

        for (Object obj : new Object[]{student, analyzer}) {
            Class<?> clazz = obj.getClass();
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);
                System.out.println(field.getName() + ": " + field.get(obj));
            }
            for (Method method : clazz.getDeclaredMethods()) {
                if (method.getName().startsWith("print") || method.getName().startsWith("calculate")) {
                    Object result = method.invoke(obj);
                    if (method.getReturnType() != void.class) {
                        System.out.println("Result: " + result);
                    }
                }
            }
        }
    }
}
