package section06;

import java.util.Comparator;
import java.util.Objects;

public class Apple implements Comparable<Apple> {
    private final int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }


    @Override
    public int compareTo(Apple another) {
        return this.weight - another.weight;
    }
}
