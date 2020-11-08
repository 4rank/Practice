package by.it.fedorinhyk.practice;

import java.util.Calendar;
import java.util.Date;

public class covid {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 8; i <31 ; i++) {
            int des = 950 + (int) (Math.random() * 49);
            int death = 1 + (int) (Math.random() * 4);
            System.out.printf("Заболели:%s Умерли:%s %2d Ноября", des, death, i);
            System.out.println(" ");
            Thread.sleep(2000);
        }
    }
}

