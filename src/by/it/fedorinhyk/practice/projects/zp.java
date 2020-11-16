package by.it.fedorinhyk.practice.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class zp {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        final ArrayList<Integer> sum = new ArrayList<>();
        System.out.println("Введите фамилию сотрудника");
        String fam=sc.nextLine();
        for (int i = 1; i <=12 ; i++) {
            System.out.println("Введите зарплату сотрудника за "+i+" месяц");
            int zp = sc.nextInt();
            sum.add(zp);
        }
        int sumAll=sum.stream().mapToInt(a->a).sum();
        Thread.sleep(1000);
        System.out.println(fam+": зарпаты по месяцам-"+sum);
        System.out.println("Всего за год: "+sumAll);
    }
}
