package section05;

public class SubPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Printing from sub printer: " + message);
    }

    @Override
    public void welcome() {
        System.out.println("Welcome from sub printer.");
    }

    static void staticMethod() {
        System.out.println("static method of sub printer");
    }
}
