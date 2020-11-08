package by.it.fedorinhyk.practice.port;

public class shipyard implements portInterface {


    @Override
    public void stay() {
        System.out.println("stay");
    }

    @Override
    public void take() {
        System.out.println("take");

    }

    @Override
    public void goAway() {
        System.out.println("go away");

    }
}
