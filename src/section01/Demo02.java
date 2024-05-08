package section01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo02 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 9, 9);

        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (Integer i : integerList) {
            if (!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        }
        System.out.println("Remove duplicate imperatively: " + uniqueList);

        List<Integer> uniqueList1 = integerList.stream()
                .distinct()
                .toList();
        System.out.println("Remove duplicate declaratively: " + uniqueList1);
    }
}
