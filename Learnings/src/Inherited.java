
public class Inherited 
{
	
	
	public static void main(String args[])
	{
		implementation obj= new implementation();
		obj.show();
	}

}

class implementation implements Interface1,Interface2
{
	public void show()
	{
		System.out.println("Interface1");
	   //return true;
	}
}