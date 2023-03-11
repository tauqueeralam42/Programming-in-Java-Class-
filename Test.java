     class Test{
        static {
            System.out.println("static block");
        }
        {
            System.out.println("init block");
        }

Test(){
System.out.println("Constructor block");
}
     

    public static void main(String[] args) {

System.out.println("hello");
Test t1= new Test();
Test t2= new Test();

        System.out.println("main block");
       
      

  
    }
}
