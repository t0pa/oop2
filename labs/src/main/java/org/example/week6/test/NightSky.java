package org.example.week6.test;
import java.util.Random;


public class NightSky {
    private double density;
    private int width;
    private int height;
    private int counter=0;
    Random random = new Random() ;

    public NightSky(double density){
        this.density = density;
        this.width=20;
        this.height=10;
    }
    public NightSky(int width, int height){
        this.density = 1.0;
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine(){
        for (int i = 0; i < width; i++){
            if (random.nextDouble()<density){
                System.out.print("*");
                counter++;
            }
            else
                System.out.print(" ");
        }
    }

    public void print(){
        counter=0;
        for (int i = 0; i < height; i++){
            printLine();
            System.out.println();
        }


    }

    public int starsInLastPrint(){
        return counter;
    }

    public static void main(String[] args) {
        NightSky sky = new NightSky(0.5,10,2);
        sky.print();
        System.out.println("Number of stars: " + sky.starsInLastPrint());
    }
}
