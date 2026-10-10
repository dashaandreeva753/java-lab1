package number10;

public interface GreetingA {

    default void greet() {
        System.out.println("Привет из GreetingA");
    }
}