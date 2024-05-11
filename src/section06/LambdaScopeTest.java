package section06;

import section05.Printer;

import java.util.concurrent.Flow;

public class LambdaScopeTest {
    private final int counter = 100;

    public static void main(String[] args) {
        LambdaScopeTest obj = new LambdaScopeTest();
    }

    private void test(String info) {
        String methodMessage = "message within method";

        Printer printer = localMessage -> {
            System.out.println(localMessage);
            System.out.println(methodMessage);
            System.out.println(counter);
            System.out.println(info);
        };

        printer.print("Hello World");
    }
}
