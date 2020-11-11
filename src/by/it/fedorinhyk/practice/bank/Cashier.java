package by.it.fedorinhyk.practice.bank;

import java.util.Objects;

public class Cashier implements Runnable {
    private String name;
    public Cashier(int number){
        this.name="\tОкно №"+number+":";
    }
    @Override
    public void run() {
        System.out.printf("%s открыто\n",this);
        while (!supervisor.bankIsClosed()){
            Man man=QueueMan.extract();
            if (Objects.nonNull(man)){
                System.out.printf("%s начало обслуживания %s\n",this,man);
                int time=Helper.getRandom(3000,5000);
                Helper.time(time);
                System.out.printf("%s конец обслуживания %s\n",this,man);
                synchronized (man){
                    man.setWaiting(false);
                    man.notify();
                }
            }
            else {
                Thread.yield();
            }
        }
        System.out.printf("%s закрыто\n",this);
    }

    @Override
    public String toString() {
        return name;
    }
}
