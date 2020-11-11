package by.it.fedorinhyk.practice.bank;

public class Man extends Thread implements Ibank {
    private boolean waiting;
    Man(int number) {
        this.setName("Клиент №"+number);
        supervisor.addClient();
        waiting=false;
    }
    public void setWaiting(boolean waiting){
        this.waiting=waiting;
    }

    @Override
    public void run(){
        enterbank();
        getmoney();
        givemoney();
        sendmoney();
        pay();
        transfer();
        goout();
    }

    @Override
    public void enterbank() {
        System.out.println(this+" зашел в банк");
    }

    @Override
    public void goout() {
        System.out.println(this+" вышел из банка");
    }

    @Override
    public void getmoney() {
        System.out.println(this+" снимает деньги");
        int time=Helper.getRandom(500,2000);
        Helper.time(time);
    }

    @Override
    public void givemoney() {
        System.out.println(this+" пополняет личный счет");
        int time=Helper.getRandom(1000,2000);
        Helper.time(time);
    }

    @Override
    public void sendmoney() {
        System.out.println(this+" пересылает деньги");
        int time=Helper.getRandom(1500,2000);
        Helper.time(time);
        synchronized (this){
            waiting=true;
            QueueMan.add(this);
            while (waiting)
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
        }
        System.out.println(this+" закончил пересылать деньги");
    }

    @Override
    public void pay() {
        System.out.println(this+" оплачивает счета");
    }

    @Override
    public void transfer() {
        System.out.println(this+" переводит деньги на другой счет");
    }

    @Override
    public String toString() {
        return getName();
    }
}
