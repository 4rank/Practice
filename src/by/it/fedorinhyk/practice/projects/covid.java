package by.it.fedorinhyk.practice.projects;

import java.util.ArrayList;

public class covid {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> total = new ArrayList<>();
        final ArrayList<Integer> totalded = new ArrayList<>();
        for (int i = 9; i < 31; i++) {
            int des = 950 + (int) (Math.random() * 49);
            int death = 1 + (int) (Math.random() * 4);
            total.add(des);
            int sum=total.stream().mapToInt(a->a).sum();
            totalded.add(death);
            int sumdead=totalded.stream().mapToInt(b->b).sum();
            System.out.printf("%2d Ноября- Заболели:%s Умерли:%s", i, des, death+"\n");
            System.out.printf(" Всего заболело:%s Всего умерло:%s", sum, sumdead+"\n");
            System.out.println(" ");
            Thread.sleep(2000);
        }
    }
}