interface IT
{
	void show();
}

abstract class C1
{
	abstract void show1();
	void display()
	{
	}
}

class C2
{
	
}

class C3
{
	void display()
	{
		System.out.println("Display Method");
	}
}

class AllAnonymousDemo
{
	public static void main(String[] args)
	{
		IT obj = new IT()//not create the object of IT it is basically inherited from IT()
		{
			public void show()
			{
				System.out.println("Interface show through anonymous");
			}
			//void display(){} //error
		};
		obj.show();
		
		C1 obj1 = new C1()//not create the object of C1 it is basically inherited from C1()
		{
			public void show1()
			{
				System.out.println("Abstract show1 through abstract");
			}
			public void display()
			{
				System.out.println("Display of abstract class C1");
			}
			/*void display()
				{
					System.out.println("display1 new method");
				}
			*/
		};
		//.display1();//error: incompatible types; void cannot be converted to c1
		obj1.show1();
		obj1.display();
		//obj1.display1();
		
		new C2()
		{
			void show2()
			{
				System.out.println("Show2 independent method through class C2");
			}
		}.show2();
		
		new AllAnonymousDemo()
		{
			void show2()
			{
				System.out.println("Show2 independent method class AllAnonymousDemo");
			}
		}.show2();
		
		C3 obj2 = new C3()//create the refenence of C3, new :create anonymous class,C3(): inherited from c3 
		{
			void display()
			{
				System.out.println("Display overriding through Anonymous");
			}
		};
		obj2.display();
	}
}