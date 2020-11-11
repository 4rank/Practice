package by.it.fedorinhyk.practice.projects;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Введи цифру от 0 до 5!");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int answer= (int) (0+Math.random()*5);
        if (a==answer){
            System.out.println("Молодец!");
            System.out.println("Самоуничтожение через...");
            Thread.sleep(1500);
            for (int i = 0; i < 10; i++) {
                System.out.println(10-i+"...");
                Thread.sleep(1000);
            }
            Thread.sleep(1550);
            System.out.println("БАБАХ!!!");
        }
        if (a!=answer){
            System.out.println("Правильный ответ: "+answer);
        }
    }
}
