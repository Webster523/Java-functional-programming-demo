package section05;

public class UsePrinterInterface {
    public int value;

    public static void main(String[] args) {
        Printer printer = message -> System.out.println(message);
        printer.welcome();
        Printer.staticMethod();

        SubPrinter subPrinter = new SubPrinter();
        subPrinter.welcome();
        SubPrinter.staticMethod();
    }
}
