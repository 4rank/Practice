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
            switch (i) {
                case 1:
                System.out.println("Введите зарплату сотрудника за январь"); break;
                case 2:
                    System.out.println("Введите зарплату сотрудника за февраль"); break;
                case 3:
                    System.out.println("Введите зарплату сотрудника за март"); break;
                case 4:
                    System.out.println("Введите зарплату сотрудника за апрель"); break;
                case 5:
                    System.out.println("Введите зарплату сотрудника за май"); break;
                case 6:
                    System.out.println("Введите зарплату сотрудника за июнь"); break;
                case 7:
                    System.out.println("Введите зарплату сотрудника за июль"); break;
                case 8:
                    System.out.println("Введите зарплату сотрудника за август"); break;
                case 9:
                    System.out.println("Введите зарплату сотрудника за сентябрь"); break;
                case 10:
                    System.out.println("Введите зарплату сотрудника за октябрь"); break;
                case 11:
                    System.out.println("Введите зарплату сотрудника за ноябрь"); break;
                case 12:
                    System.out.println("Введите зарплату сотрудника за декабрь"); break;
            }
            int zp = sc.nextInt();
            sum.add(zp);
        }
        int sumAll=sum.stream().mapToInt(a->a).sum();
        Thread.sleep(1000);
        System.out.println(fam+": зарпаты по месяцам-"+sum);
        System.out.println("Всего за год: "+sumAll);
    }
}
