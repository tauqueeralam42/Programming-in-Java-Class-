public class StringBuilderEnsureCapacity {
    public static void main(String[] args) {
        StringBuilder bs6 = new StringBuilder();
        System.out.println(bs6.capacity());

        StringBuilder bs5 = new StringBuilder("Hello");
        System.out.println(bs5.capacity());

        StringBuilder bs1 = new StringBuilder(7);
        System.out.println(bs1.capacity());

        bs1.ensureCapacity(9);
        System.out.println(bs1.capacity());

        StringBuilder bs4 = new StringBuilder(10);
        bs4.ensureCapacity(9);
        System.out.println(bs4.capacity());

	StringBuilder bs2 = new StringBuilder("a");
        bs2.append("absc");
        System.out.println("bs2 :=" +bs2.capacity());
        bs2.ensureCapacity(18);
        System.out.println(bs2.capacity());

        StringBuilder bs3 = new StringBuilder();
        System.out.println(bs3.capacity());
        bs3.ensureCapacity(56);
        System.out.println(bs3.capacity());
    }
}
