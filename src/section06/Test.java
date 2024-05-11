package section06;

import section05.Printer;

public class Test {
    public static void main(String[] args) {
//        String msg = "Hello";
//        Printer printer = info -> {
//            String msg = "Hi";
//            System.out.println(msg + info);
//        };
//        printer.print("world");

        String message = "Hello";
        Printer printer = info -> {
            System.out.println(message + info);
        };
        printer.print(" World");
    }
}
