package section02;

public class SideEffectIllustration {
    public int f1(int x) {
        return x * 2;
    }

    private int state = 0;

    public int f2(int x) {
        state++;
        return x * 2 + state;
    }

    public static void main(String[] args) {
        SideEffectIllustration obj = new SideEffectIllustration();

        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
//                System.out.printf("The result of No.%d is %d%n", index + 1, obj.f1(5));
                System.out.printf("The result of No.%d is %d%n", index + 1, obj.f2(5));
            });
            threads[i].start();
        }
    }
}
