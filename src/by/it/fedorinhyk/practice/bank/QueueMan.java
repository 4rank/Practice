package by.it.fedorinhyk.practice.bank;

import java.util.Deque;
import java.util.LinkedList;

public class QueueMan {
    private static final Object monitor=new Object();
    private static Deque<Man>deque= new LinkedList<>();

    static void add(Man man){
        synchronized (monitor){
            deque.addLast(man);
        }
    }
    static Man extract(){
        synchronized (monitor){
            return deque.pollFirst();
        }
    }
}
