    class MethodOverride1{

    class Parent{
        void show(){
            System.out.println("Parent's show()");
        }
    }

    class Child extends Parent{
        void show(){
            System.out.println("Child's show()");
        }
    }



    
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.show();
        Child obj2 = new Child();
        obj2.show();
        
    }
}
