package number10;

public class GreetingService implements GreetingA, GreetingB {

    @Override
    public void greet() {
        GreetingA.super.greet();
    }
}