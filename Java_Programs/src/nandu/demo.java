package nandu;

public class demo {
	static int a;
	static int b;
	static 
	{
		a=10;
		b=20;
		System.out.println("hi");
	}
	
void ab()
{
	System.out.println("welcome");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("value of a is"+a);
		System.out.println("value of a is"+b);
		demo ob=new demo();
		ob.ab();

	}

}
