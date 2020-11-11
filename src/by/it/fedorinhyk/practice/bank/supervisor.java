package by.it.fedorinhyk.practice.bank;

public class supervisor {
    private supervisor() {
    }
    private static volatile int clientsEnter=0;
    private static volatile int clientsGoOut=0;
    private static int cashBox=0;
    private static final int totalClients=200;
    private static final int cashMax=1000;

    static synchronized void addClient(){
        clientsEnter++;
    }
    static void outClient(){
        synchronized (supervisor.class){
            clientsGoOut++;
        }
    }
    static boolean bankIsOpen(){
        return clientsEnter!=totalClients;
    }
    static boolean bankIsClosed(){
        return clientsGoOut==totalClients;
    }
    static boolean cashBoxFull(){
        return cashBox==cashMax;
    }
}
