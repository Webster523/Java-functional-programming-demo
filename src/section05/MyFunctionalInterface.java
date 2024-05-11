package section05;

@FunctionalInterface
public interface MyFunctionalInterface {
    int MAX_VALUE = 255;

    void func();

    int hashCode();
    String toString();
    boolean equals(Object obj);

    private void instancePrivateMethod() {
        System.out.println("JDK9: private instance method in interface");
    }

    default void defaultMethod() {
        System.out.println("JDK8: default method in interface");
        instancePrivateMethod();
    }

    private static void staticPrivateMethod() {
        System.out.println("JDK9: private static method in interface");
    }

    static void staticMethod() {
        System.out.println("JDK8: static method in interface");
        staticPrivateMethod();
    }
}
