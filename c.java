class P{
    protected void f1(){
        System.out.println("h");
    }
}
class c extends P{
    void f1(){
        System.out.println("h1");
    }
    public static void main(String[] args) {
        c c1= new c();
        c1.f1();
    }
}