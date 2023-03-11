/* StringBuilder class is betterversion of string class.
  Stringbuilder class object are mutable(can be manipulated) code consists of of String class
 */

public class LogicStringBuilder {
   
    void stringBuilderMethods(){

        StringBuilder sb = new StringBuilder("Hello my students");
        sb.append("xyz");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.setLength(30);
        // System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        sb.setCharAt(2,'w');
        System.out.println("setCharAt:" +sb);
        sb.reverse();
        System.out.println("reverse :" +sb);
        sb.reverse();
        sb.insert(2, 'y');
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println("delete charAt :" +sb);
        sb.delete(5, 10);
        System.out.println("delete: " +sb);
        System.out.println(sb.substring(5));
        System.out.println(sb);
        System.out.println(sb.substring(5,7));

    
    
        StringBuilder b1 = new StringBuilder("Hello");
        StringBuilder b2 = new StringBuilder("Hello");
        System.out.println("b1 equals b2 = " +b1.equals(b2));
        System.out.println("b1 equals bs toString()=" +b1.toString().equale(b2.toString()));
}
}
        
	public class P19StringBuilder{
public static void main(String[] ar){
LogicStringBuilder obj = new LogicStringBuilder();
obj.stringBuilderMethods();
}
}
    
    

