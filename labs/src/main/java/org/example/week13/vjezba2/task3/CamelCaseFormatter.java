package org.example.week13.vjezba2.task3;

public class CamelCaseFormatter implements TextFormatter{



    public String formatText(String text) {
        String[] words = text.split(" ");
        String finalWord = "";
        finalWord += words[0].toLowerCase();
        for(int i = 1; i < words.length; i++){
            if(words[i].isEmpty()) continue;
            finalWord += words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return finalWord;
    }
}



