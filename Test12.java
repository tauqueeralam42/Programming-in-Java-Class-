
    class Parent{
        int a = 20;
        void show(int a){
            System.out.println(a);
        }
    }

    class Child extends Parent{
        int a =30;
        void show(){
            System.out.println(a);
        }
    }

    class Test12{

    
    public static void main(String[] args) {
        
        Child c1 = new Child();
       // c1.show(10);
        c1.show();
        
    }
}
