interface Printable{
void print();
}
interface Showable{	
void show();
}
class test
{
	void hello()
	{
		System.out.println("test class");
	}
}
class inter extends test implements Printable, Showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}
	public static void main(String args[])
	{
		inter obj = new inter();
		obj.print();
		obj.show();
	}
}
