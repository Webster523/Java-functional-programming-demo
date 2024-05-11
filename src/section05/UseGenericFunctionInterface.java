package section05;

import java.util.function.Function;

public class UseGenericFunctionInterface {
    public static void main(String[] args) {
        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Hello World"));
    }
}
