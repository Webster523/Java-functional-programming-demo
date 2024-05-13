package section08;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class UseConsumerAndSupplier {
    public static void main(String[] args) {
//        consumerAndSupplier();
//        consumerAndThen();
        consumerAndThen2();
    }

    private static void consumerAndSupplier() {
        Consumer<String> printer = System.out::println;
        Supplier<Integer> numFactory = () -> new Random().nextInt();
        for (int i = 0; i < 5; i++) {
            printer.accept(numFactory.get().toString());
        }
    }

    private static void consumerAndThen() {
        Consumer<String> consumer1 = info -> System.out.println("First consumer: " + info);

        Consumer<String> consumer2 = consumer1.andThen(info -> System.out.println("Second consumer: " + info.toUpperCase()));

        consumer2.accept("Hello");
    }

    private static void consumerAndThen2() {
        Consumer<String> consumer1 = info -> System.out.println("First consumer: " + info);

        Consumer<String> consumer2 = info -> System.out.println("Second consumer: " + info.toUpperCase());

        Consumer<String> consumer3 = System.out::println;

        consumer1.andThen(consumer2).andThen(consumer3).accept("abcd");
    }
}
