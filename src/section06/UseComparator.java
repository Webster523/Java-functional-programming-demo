package section06;

import java.util.Arrays;
import java.util.Comparator;

public class UseComparator {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "carrot", "dog", "elephant",
                "fish", "giraffe", "horse", "ice cream", "jacket",
                "kangaroo", "lion", "monkey", "noodle", "orange",
                "penguin", "quilt", "rabbit", "snake", "turtle"
        };

        Comparator<String> comparator = (String str1, String str2) -> {
            return str1.compareTo(str2);
        };
        Arrays.sort(words, comparator);
        System.out.println(Arrays.toString(words));
    }
}
