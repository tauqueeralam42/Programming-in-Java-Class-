import java.util.*;
class Cube{
   int length, breath, height;

    Cube(int l, int b, int h){
      length = l;
      breath = b;
      height = h;

    }  

    int getVolume(){
      return length*breath*height;
    }
    
    public static void main(String[] args) {
      Cube c1 = new Cube();
      Cube c2 = new Cube(10,20,30);
      System.out.println("Cube is : " + c1.getVolume());
      System.out.println("Cube is : " + c2.getVolume());

    }
    
}
