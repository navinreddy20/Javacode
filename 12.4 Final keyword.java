//final - variable, method, class

//final class Calc
//{
//	public void show()
//	{
//		System.out.println("in Calc show");
//	}
//	public void add(int a, int b)
//	{
//		System.out.println(a+b);
//	}
//}


class Calc
{
	public final void show()
	{
		System.out.println("By Navin");
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

class AdvCalc extends Calc
{
	public void show()
	{
		System.out.println("By John");
	
}

	
public class  Demo{
    public static void main(String[] args) {
        
//    	final int num=8;
//    	num=9;
//    	System.out.println(num);
    	
//    	Calc obj= new Calc();
//    	obj.show();
//    	obj.add(4, 5);
    	
    	AdvCalc obj= new AdvCalc();
    	obj.show();
    	obj.add(4, 5);
    }
}