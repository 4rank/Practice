package by.it.fedorinhyk.practice;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class covid {
    public static void main(String[] args) throws InterruptedException {
        for (;;) {
            Calendar calendar = Calendar.getInstance();
            Date moment = calendar.getTime();
            int des = 950 + (int) (Math.random() * 49);
            int death = 1 + (int) (Math.random() * 4);
            System.out.printf("Заболели:%s Умерли:%s Время: %s", des, death, moment);
            System.out.println(" ");
            Thread.sleep(2000);
        }
    }
}

