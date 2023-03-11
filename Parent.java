import java.util.*;

class Parent {
    public Parent(){
        System.out.println("Parent Class");
    }
}
class Parent2 extends Parent{
    public Parent2(){
        System.out.println("Parent2 Class");

    }
}

class Child extends Parent2
	{
public Child(){
System.out.println("child Class");
	}


public static void main(String[] args) 
	{
	Child c = new Child();
	}
}
    

