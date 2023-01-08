// class Computer
// {
//	
// }
// class Laptop extends Computer
// {
//	
// }

class A
{
	public void show()
	{
		System.out.println("in A show");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("in B show");
	}
}

class C extends A
{
	public void show()
	{
		System.out.println("in C show");
	}
}

class D
{
	
}


public class Demo{
	public static void main(String[] args) {
//		A obj=new B();
//		obj.show();
		
		A obj=new A();
		obj.show();
		
		obj=new B();
		obj.show();
		
		obj=new C();
		obj.show();
		
//		obj=new D();
		
//		Laptop obj1=new Laptop();
//		Computer obj1=new Laptop();
	
	}
}