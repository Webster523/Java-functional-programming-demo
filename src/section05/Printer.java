package section05;

@FunctionalInterface
public interface Printer {
    void print(String message);

    default void welcome() {
        print("Hello");
    }

    static void staticMethod() {
        System.out.println("static method of Printer");
    }
}
