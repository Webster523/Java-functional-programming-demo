package section03;

import java.util.function.Function;

public class FirstClassCitizenParameter {
    public static String concatAndTransform(String a, String b, Function<String, String> stringTransform) {
        if (stringTransform != null) {
            a = stringTransform.apply(a);
            b = stringTransform.apply(b);
        }
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(concatAndTransform("Hello ", "World", s -> s.toUpperCase()));
        System.out.println(concatAndTransform("Hello ", "World", s -> s.toLowerCase()));
    }

}
