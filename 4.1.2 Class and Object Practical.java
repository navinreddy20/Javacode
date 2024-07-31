class Calculator{
	public int add(int n1, int n2)
	{
		//int a;
		//System.out.println("in add");
		//return 0;

		//int r=num1+num2;
		//return r;

		int r=n1+n2;
		return r;
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		int num1=4;
		int num2=5;
		Calculator calc= new Calculator();
		int result=calc.add(4,5);
		//calc.add();
		//int result=calc.add();
		//int result=num1+num2;
		System.out.println(result);
		
	}
}

// Object Oriented programming
// Object - Properties and Beahaviors

//Class