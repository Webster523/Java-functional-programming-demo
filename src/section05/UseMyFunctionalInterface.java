package section05;

public class UseMyFunctionalInterface {
    public static void main(String[] args) {
        MyFunctionalInterface.staticMethod();

        System.out.println(MyFunctionalInterface.MAX_VALUE);

        MyFunctionalInterface obj = new MyFunctionalClass();
        obj.func();
        obj.defaultMethod();
        System.out.println(obj.hashCode());

        obj = () -> System.out.println("Use lambda expression to initialise an interface");
        obj.func();
        obj.defaultMethod();
        System.out.println(obj.hashCode());
    }
}
