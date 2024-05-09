package section03;

import java.util.function.BiFunction;
import java.util.stream.Stream;

public class FirstClassCitizenVariable {
    private static String concatString(String a, String b) {
        return a + b;
    }

    private String concatString2(String a, String b) {
        return a + b;

    }

    public static void main(String[] args) {
        BiFunction<String, String, String> concatFunction = (s, t) -> {
            return s + t;
        };

        System.out.println(concatFunction.apply("Hello ", "World 1"));

        concatFunction = FirstClassCitizenVariable::concatString;
        System.out.println(concatFunction.apply("Hello ", "World 2"));

        FirstClassCitizenVariable obj = new FirstClassCitizenVariable();
        concatFunction = obj::concatString2;
        System.out.println(concatFunction.apply("Hello ", "World 3"));

        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);
    }
}
