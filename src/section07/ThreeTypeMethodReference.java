package section07;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ThreeTypeMethodReference {
    public static void main(String[] args) {
        Stream.of(3, 1, 4, 1, 5, 9)
                .forEach(x -> System.out.println(x));
        Stream.of(3, 1, 4, 1, 5, 9)
                .forEach(System.out::println);

        Stream.generate(() -> Math.random())
                .limit(10)
                .forEach(System.out::println);
        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);

        List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");
        strings.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .forEach(System.out::println);
        strings.stream()
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }
}
