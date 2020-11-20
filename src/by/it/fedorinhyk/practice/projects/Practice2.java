package by.it.fedorinhyk.practice.projects;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) throws InterruptedException {
        Date mom;
        Calendar time = Calendar.getInstance();
        mom=time.getTime();
        System.out.println("Hi!!!");
        Thread.sleep(1500);
        System.out.println("What time is it???");
        Thread.sleep(1000);
        System.out.println(mom+" Hmmmm.....");
        Thread.sleep(2000);
        System.out.println("It's time to do something!!!");
        deal();
    }
    private static void deal() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Write number between 0 and 5");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int answer = (int) (0 + Math.random() * 5);
        if (a == answer) {
            Thread.sleep(1000);
            System.out.println("You're so lucky!");
        }
        else if (a >= 0 && a <= 5) {
            Thread.sleep(1000);
            System.out.println("Wrong!!!");
            Thread.sleep(1500);
            System.out.println("The right answer is: " + answer);
        }
        else {
            Thread.sleep(1000);
            System.out.println("Oh my god...");
            Thread.sleep(1000);
            System.out.println("I say BETWEEN 0 AND 5!");
        }
    }
}
