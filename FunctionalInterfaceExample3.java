interface Doable {
    default void doIt() {
        System.out.println("Do it now");
    }

   // void sum();
}

@FunctionalInterface
interface Sayable extends Doable {
    void say(String msg);
}

public class FunctionalInterfaceExample3 implements Sayable {
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();
        fie.say("Hello there");
        fie.doIt();
    }
}
