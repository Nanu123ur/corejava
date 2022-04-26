package nandu;

public class staticmethod {
	static int j=100;// static variable
	int n=200;// instance variable
	static void a()
	{
		int a=200;// local variable
		System.out.println("print from a");
		n=30;
		a2();
		System.out.println(super.j);
		
	}
 void a2()//instance method
{
	System.out.println("inside a2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticmethod ob=new staticmethod();
		ob.a2();
		staticmethod.a();
		
		

	}

}
