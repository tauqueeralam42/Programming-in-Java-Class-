class LocalClassvariable{
void f1(){
int a =10;
class local{
int a=20;
void display(){
int a= 30;
LocalClassvariable a1 = new LocalClassvariable();
System.out.println("Value = " +a+" "+this.a);
}
}
local l1 = new local();
l1.display();
}
public static void main(String... aa)
{
LocalClassvariable obj = new LocalClassvariable();
obj.f1();
}
}