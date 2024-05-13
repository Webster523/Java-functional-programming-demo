package section07;

import java.util.List;

public class WhyUseMethodReference {
    public static void main(String[] args) {

    }

    private static void useLambdaToPrint() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        nums.forEach(num -> System.out.println(num));
    }

    private static void useMethodReferenceToPrint() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        nums.forEach(System.out::println);
    }
}
