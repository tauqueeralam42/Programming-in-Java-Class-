public class StringExample {
    public static void main(String[] args) {
        String s = "Hello Stusdents.";
        String s1="Hello students.";

        System.out.println(s.charAt(3));
        System.out.println(s.startsWith("hello"));

        System.out.println(s.endsWith("ents."));
        boolean b = s.endsWith("ents.");
        System.out.println(b);
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.length());
        System.out.println(s1.indexOf('s'));
        System.out.println(s1.indexOf('s',6));
        System.out.println(s1.lastIndexOf('s'));
        System.out.println(s1.lastIndexOf('s',13));

System.out.println("My name is \" Tauqueer \" ");

    }
}
