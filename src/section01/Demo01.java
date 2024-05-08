package section01;

import java.util.stream.IntStream;

public class Demo01 {
    static void calculateUseImperativeStyle() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void calculateUseDeclarativeStyle() {
        int sum = IntStream.rangeClosed(1, 100).sum();
        System.out.println(sum);
    }

    public static void main(String[] args) {
        System.out.println("Imperative invocation: ");
        calculateUseImperativeStyle();
        System.out.println("Declarative invocation: ");
        calculateUseDeclarativeStyle();
    }
}
