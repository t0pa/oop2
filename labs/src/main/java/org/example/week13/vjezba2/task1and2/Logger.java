package org.example.week13.vjezba2.task1and2;

public class Logger {
    private static Logger instance;

    private Logger(){
    }

    public static Logger getInstance()
    {
        if (instance==null){
            instance= new Logger();
        }
        return instance;

    }

    public void log(String message) {
        System.out.println(":Logs a general message");
    }


    public void logInfo(String message){
        System.out.println("Logs an informational message");
    }

    private String mjaukanje="ae";
    public void setMjau(String mjau){
        mjaukanje=mjau;
    }

    public String getMjaukanje() {
        return mjaukanje;
    }
}


class Proba{

    public static void main(String[] args) {
        Logger l1 = Logger.getInstance();
        l1.setMjau("sssss");

        Logger l2 = Logger.getInstance();
        System.out.println(l2.getMjaukanje());
    }
}