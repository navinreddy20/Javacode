abstract class A
{
	public abstract void show();
	public abstract void config();

}

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}


public class  Demo{
    public static void main(String[] args) {
    	
//    	A obj=new B();
    	
    	A obj=new A() 
    	{
    		public void show()
    		{
    			System.out.println("in new show");
    		}
    	};
    	obj.show();
    	
    }
}

