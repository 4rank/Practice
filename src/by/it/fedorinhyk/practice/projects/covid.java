package by.it.fedorinhyk.practice.projects;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class covid {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Статистика covid-19 для минздрава на 30 дней.");
        Thread.sleep(1000);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число заболевших и умерших."+"\n"+"На данный момент заболело:");
            if (sc.hasNextInt()) {
                int bol = sc.nextInt();
                System.out.println("На данный момент умерло:");
                if (sc.hasNextInt()){
                int dead = sc.nextInt();
                ArrayList<Integer> total = new ArrayList<>();
                Calendar time = Calendar.getInstance();
                Locale rus = new Locale("ru", "RU");
                SimpleDateFormat date = new SimpleDateFormat("dd MMMM", rus);
                final ArrayList<Integer> totalDead = new ArrayList<>();
                for (int i = 1; i <= 31; i++) {
                    time.add(Calendar.DAY_OF_MONTH, +i);
                    int des = 950 + (int) (Math.random() * 250);
                    int death = 2 + (int) (Math.random() * 6);
                    total.add(des);
                    int sum = total.stream().mapToInt(a -> a).sum();
                    totalDead.add(death);
                    int sumDead = totalDead.stream().mapToInt(b -> b).sum();
                    System.out.printf("%s - Заболели:%s Умерли:%s", date.format(time.getTime()), des, death + "\n");
                    System.out.printf(" Всего заболело:%s Всего умерло:%s", sum + bol, sumDead + dead + "\n");
                    System.out.println(" ");
                    Thread.sleep(1000);
                    time.add(Calendar.DAY_OF_MONTH, -i);
                }
            } else {
                    System.out.println("Введите целое число.");
                }
            }else {
                System.out.println("Введите целое число.");
            }
        }
    }
}