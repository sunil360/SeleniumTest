
public class Testdemo {
	
	

	public static void main(String[] args) {
		
		displaytest obj= new displaytest2();
		obj.display();

		displaytest d = new displaytest();
		displaytest2 child = new displaytest2();
		
		displaytest2 obj1 = (displaytest2)d;
		
		
		
		
	}

}

class displaytest
{
	int x=5;
	public void display()
	{
		System.out.println("displaytest");
	}
}


class displaytest2 extends displaytest
{int y=10;

	public void display()
	{
		
		System.out.println("displaytest2");
	}
	
	
}
