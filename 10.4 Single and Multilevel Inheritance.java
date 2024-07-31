class Calc
{
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	public int sub(int n1, int n2)
	{
		return n1-n2;
	}
}


class AdvCalc extends Calc
{
	public int multi(int n1, int n2)
	{
		return n1*n2;
	}
	public int div(int n1, int n2)
	{
		return n1/n2;
	}
}

//class VeryAdvCalc extends Calc
class VeryAdvCalc extends AdvCalc
{
	public double power(int n1,int n2)
	{
		return Math.pow(n1, n2);
	}
}

public class Demo
{
	public static void main(String a[]) 
	{
//		Calc obj=new Calc();
//		AdvCalc obj=new AdvCalc();
		VeryAdvCalc obj=new VeryAdvCalc();
		
		int r1=obj.add(4, 5);
		int r2=obj.sub(7,3);
		int r3=obj.multi(5,3);
		int r4=obj.div(15,4);
		double r5=obj.power(4,2);
		
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
		
	}
}

