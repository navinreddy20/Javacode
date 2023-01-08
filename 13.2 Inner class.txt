class A
{
	int age;
	
	public void show()
	{
		System.out.println("in show");
	}
	
//	class B
//	{
//		public void config()
//		{
//			System.out.println("in config");
//		}
//	}
	
	static class B
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
}


public class  Demo{
    public static void main(String[] args) {
    	A obj=new A();
    	obj.show();
    	
//    	A.B obj1=obj.new B();
//    	obj1.config();
    	
    	A.B obj1=new A.B();
    	obj1.config();

    }
}

