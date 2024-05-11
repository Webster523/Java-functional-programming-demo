package section05;

@FunctionalInterface
public interface Printer {
    int MAX_VALUE = 255;

    void print(String message);

    default void welcome() {
        print("Hello");
    }

    static void staticMethod() {
        System.out.println("static method of Printer");
    }
}
