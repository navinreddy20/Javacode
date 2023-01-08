class Launch
{
	A obj=new A();
	System.out.println(obj.marks);
}




package other;

public class A{
	int marks=6;
//	protected marks=6;
	public void show()
	{
		
	}
}




public class B
{
//	private int marks;
	int marks;
	
}




class C extends A
{
	public void abc()
	{
		System.out.println(marks);
	}
}

public class Demo{
	public static void main(String[] args) {
   
	A obj=new A();
	System.out.println(obj.marks);
	obj.show();
	
	B obj1=new B();
	System.out.println(obj.marks);
	
	}
}