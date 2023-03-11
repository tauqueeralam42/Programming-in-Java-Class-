interface Drawable {
    void draw();

    default void msg() {
        System.out.println("default method");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class TestInterfaceDefault {
    public static void main(String args[]) {
        Drawable d = new Rectangle();
        d.draw();
        d.msg();
        Rectangle b1 = new Rectangle();
        b1.draw();
        b1.msg();
    }
}
