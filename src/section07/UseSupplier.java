package section07;

import java.util.function.Supplier;

public class UseSupplier {
    public static void main(String[] args) {
        Supplier<ExampleClass> supplier = () -> new ExampleClass();
        System.out.println(supplier.get());

        Supplier<ExampleClass> supplier1 = ExampleClass::new;
        System.out.println(supplier1.get());
    }
}

class ExampleClass {
}
