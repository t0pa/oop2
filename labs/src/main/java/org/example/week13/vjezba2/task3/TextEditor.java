package org.example.week13.vjezba2.task3;

public class TextEditor {

    TextFormatter textFormatter;

    public void setTextFormatter(TextFormatter formatter){
        textFormatter=formatter;
    }

    public String formatText(String text){
        return textFormatter.formatText(text);
    }

}

class Main{
    public static void main(String[] args) {
        TextEditor t1 = new TextEditor();

        t1.setTextFormatter(new CamelCaseFormatter());

       
        System.out.println(t1.formatText("mrnjao ma o cisosaoos csasd"));

    }
}
