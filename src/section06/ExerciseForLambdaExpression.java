package section06;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExerciseForLambdaExpression {
    public static void main(String[] args) {
        Predicate<List<String>> predicate1 = list -> list.isEmpty();

        Supplier<Apple> supplier1 = () -> new Apple(10);

        Consumer<Apple> consumer1 = apple -> System.out.println(apple.getWeight());

        Function<String, Integer> function1 = str -> str.length();

        BiFunction<Integer, Integer, Integer> biFunction1 = (a, b) -> a * b;

        BiFunction<Apple, Apple, Integer> biFunction2 = (apple1, apple2) -> apple1.compareTo(apple2);
    }
}
