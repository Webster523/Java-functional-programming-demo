package section05;

public class UserMyGenericFunctionInterface {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> function = (x, y, z) -> x + y + z;
        System.out.println(function.apply(1, 2, 3));
    }
}
