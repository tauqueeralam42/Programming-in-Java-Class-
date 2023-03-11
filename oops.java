class Pen{
    String color;
    String type;

    Pen(){
        System.out.println("hello");
    }
    Pen(String color){
        System.out.println("lol");
        this.color = color;
    }

    public void show(){
        System.out.println(color);
    }
}

public class oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen("white");

        p1.color = "blue";
       // p2.color = "white";

        p1.show();
        p2.show();

        System.out.println(p1.type);
    }
}
