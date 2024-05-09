package section03;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleValue = value -> value * 2;
        System.out.println(doubleValue.apply(100));
    }
}
