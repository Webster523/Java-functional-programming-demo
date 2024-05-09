package section03;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UseStreamAPI {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        IntStream nums = Arrays.stream(arr);

        String evenNums = nums
                .filter(num -> num % 2 == 0)
                .boxed()
                .map(Objects::toString)
                .collect(Collectors.joining(", "));

        System.out.println(evenNums);
    }
}
