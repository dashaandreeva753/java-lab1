package number10;

public interface GreetingB {

    default void greet() {
        System.out.println("Привет из GreetingB");
    }
}