package nandu;
import mypackage.*;
abstract class hai
{
	abstract void withdraw();// abstract method 
	
}

public  class Dataabstraction extends hai{
	void withdraw()
	{
		System.out.println("withdraw");
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Dataabstraction ob1=new Dataabstraction();
		ob1.withdraw();
		

	}

}
