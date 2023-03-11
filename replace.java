public class replace {
    public static void main(String[] args) {
        String str = "have.fun.with.java";
        String [] s = str.split("\\.", -1);
        for(String x:s)
         System.out.println(x);
    }
}
