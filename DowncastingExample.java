class Computer extends Machine{
    void getPrice(){
        System.out.println("price =" +price);
    }
}

class Machine{
    int price;
}

class DowncastingExample{
    public static void main(String[] args) {
        Computer c1 = new Computer();
        Machine m1 = new Machine();
        DowncastingExample b1 = new DowncastingExample();
        b1.display(m1);
        b1.display(c1);
    
    }

    void display(Machine mc){
        if(mc instanceof Computer){
            Computer c2 = (Computer)mc;
            c2.getPrice();

        }

        else
        System.out.println("Downcasting not possible");
    }
}