package by.it.fedorinhyk.practice;

import java.util.ArrayList;

public class covid {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> total = new ArrayList<>();
        for (int i = 9; i < 31; i++) {
            int des = 950 + (int) (Math.random() * 49);
            int death = 1 + (int) (Math.random() * 4);
            int sum= (int) total.stream().mapToDouble(a->a).sum();
            total.add(des);
            System.out.printf(" %2d Ноября- Заболели:%s Умерли:%s Всего болеет:%s", i, des, death,sum);
            System.out.println(" ");
            Thread.sleep(2000);
        }
    }
}

