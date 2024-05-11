package section06;

public class UseSimpleInterface {
    public static void main(String[] args) {
        SimpleInterface obj = () -> System.out.println("This is a lambda example.");
        obj.doSomething();

        SimpleInterface obj2 = () -> {
            System.out.println("Hello");
            System.out.println("World");
        };
        obj2.doSomething();
    }
}
