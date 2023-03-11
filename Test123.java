import java.util.*;

    
    class Parent{
        int a = 20;
        
    }

    class Child extends Parent{
        int a =30;
        
    }

  

    class Test12{
    public static void main(String[] args) {
        
        Child c1 = new Child();
       
        System.out.println(c1.a);
        
    }
}
