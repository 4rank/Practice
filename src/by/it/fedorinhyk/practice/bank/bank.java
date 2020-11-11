package by.it.fedorinhyk.practice.bank;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class bank {
    public static void main(String[] args) {
        int ManNumber=0;
        System.out.println("Банк открыт");
        ExecutorService newThreat= Executors.newFixedThreadPool(5);
        for (int i = 1; i <=5 ; i++) {
            Cashier cashier=new Cashier(i);
            newThreat.execute(cashier);
        }
        newThreat.shutdown();
        while (supervisor.bankIsOpen()){
            int count=Helper.getRandom(5);
            for (int i = 0; i < count && supervisor.bankIsOpen(); i++) {
                Man man=new Man(++ManNumber);
                man.start();
            }
            Helper.time(1000);
        }
        while (true){
            try {if (newThreat.awaitTermination(1000, TimeUnit.SECONDS)) break;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Банк закрыт");
    }
}
