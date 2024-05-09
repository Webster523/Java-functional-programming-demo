package section03;

import java.util.function.Function;
import java.util.function.Supplier;

public class HighOrderFunction {
    private static Supplier<String> createCombineAndTransform(String a, String b, Function<String, String> transformer) {
        return () -> {
            String aCopy = a;
            String bCopy = b;
            if (transformer != null) {
                aCopy = transformer.apply(a);
                bCopy = transformer.apply(b);
            }
            return aCopy + bCopy;
        };
    }

    public static void main(String[] args) {
        Supplier<String> transform = createCombineAndTransform("Hello ", "World", String::toUpperCase);
        System.out.println(transform.get());
    }
}
