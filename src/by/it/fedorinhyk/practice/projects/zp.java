package by.it.fedorinhyk.practice.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class zp {
    public static void main(String[] args) throws InterruptedException {
        try (Scanner sc = new Scanner(System.in)) {
            final ArrayList<Double> sum = new ArrayList<>();
            final ArrayList<Double> sumPercent = new ArrayList<>();
            System.out.println("Введите фамилию сотрудника");
            String fam = sc.nextLine();
            for (int i = 1; i <= 12; i++) {
                switch (i) {
                    case 1:
                        System.out.println("Введите зарплату сотрудника за январь в рублях");
                        break;
                    case 2:
                        System.out.println("Введите зарплату сотрудника за февраль в рублях");
                        break;
                    case 3:
                        System.out.println("Введите зарплату сотрудника за март в рублях");
                        break;
                    case 4:
                        System.out.println("Введите зарплату сотрудника за апрель в рублях");
                        break;
                    case 5:
                        System.out.println("Введите зарплату сотрудника за май в рублях");
                        break;
                    case 6:
                        System.out.println("Введите зарплату сотрудника за июнь в рублях");
                        break;
                    case 7:
                        System.out.println("Введите зарплату сотрудника за июль в рублях");
                        break;
                    case 8:
                        System.out.println("Введите зарплату сотрудника за август в рублях");
                        break;
                    case 9:
                        System.out.println("Введите зарплату сотрудника за сентябрь в рублях");
                        break;
                    case 10:
                        System.out.println("Введите зарплату сотрудника за октябрь в рублях");
                        break;
                    case 11:
                        System.out.println("Введите зарплату сотрудника за ноябрь в рублях");
                        break;
                    case 12:
                        System.out.println("Введите зарплату сотрудника за декабрь в рублях");
                        break;
                }
                if (sc.hasNextDouble()) {
                    double zp = sc.nextDouble();
                    sum.add(zp);
                    sumPercent.add(zp);
                } else {
                    System.out.println("В зарплаты вводите числа.");
                    System.exit(0);
                }
            }
            double sumAll = sum.stream().mapToDouble(a -> a).sum();
            System.out.println("Введите процент налога числом.");
            if (sc.hasNextDouble()) {
                double percent = sc.nextDouble();
                double fin = sumAll * ((100 - percent) / 100);
                for (int i = 0; i <sumPercent.size() ; i++) {
                    int j= (int) (sumPercent.get(i)* ((100 - percent) / 100));
                    sumPercent.set(i, (double) j);
                }
                Thread.sleep(500);
                System.out.println(fam + ": зарпаты по месяцам-" + sum);
                System.out.println("Подоходный налог: " + percent);
                System.out.println(fam + ": Зарплаты по месяцам с вычетом налога-" + sumPercent);
                System.out.printf("Всего за год: %.2f",fin);
            }
             else {
                System.out.println("Введите процент чилом без знака %");
                System.exit(0);
            }
        }
    }
}