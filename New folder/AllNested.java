class AllNested{
static class nestedstatic{
int a = 10;
static int b = 20;
void display(){
System.out.println("non static a = "+a);
System.out.println("ststic b = "+b);
}
}
class inner 
{
int a = 10;
final static int b = 20;
void display(){
System.out.println("ststic b = " +b);
int a = 10;
System.out.println("inner a = " +a);
class localclass{
int b;
void show(){
system.out.println("local a=" +a);
}
}
localclass obj3 = new localclass();
obj3.show();
}
}
public static void main(String args[]){
new AllNested(){
void display(){
System.out.println("Hello");
}.display();
}
AllNested obj2 = new AllNested();
AllNested inner obj1 = obj2.new inner();
obj1.display();
};
}
