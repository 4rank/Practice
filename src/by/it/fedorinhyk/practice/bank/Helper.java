package by.it.fedorinhyk.practice.bank;

import java.util.Random;

class Helper {
    private static final Random random=new Random();
    static int getRandom(int min, int max){
        return min+random.nextInt(max-min+1);
    }
    static int getRandom(int max){
        return getRandom(0,max);
    }
    static void time(int milisec){
        try {
            Thread.sleep(milisec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
