class ThisDemo{

  	public ThisDemo() {
		this(10);   
		System.out.println("First Constructor");
		                                }
	public ThisDemo(int a) {
		this(10,20);   
		System.out.println("Second Constructor");
			              }

	public ThisDemo( int a, int b) {
		this(“Ravi Kant");  
		 System.out.println("Third Constructor");
		                                }
	public ThisDemo(String s)
		{
		System.out.println("Fourth Constructor");
			              }
	public static void main(String args[]){

               ThisDemo first = new ThisDemo(); 
				  	       }
		       }
