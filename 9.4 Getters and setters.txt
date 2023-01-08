class Human
{
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="Navin";
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}
	
//	public void SetAge(int a)
//	{
//		age=a;
//	}
	
//	public int abc()
//	{
//		return age;
//	}
//	public void xyz(int a)
//	{
//		age=a;
//	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
//	public void setName(String n)
//	{
//		name=n;
//	}
}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
//		obj.xyz(30);
		obj.SetAge(30);
		obj.setName("Reddy");
//		obj.age=11;
//		obj.name="Navin";
		
//		System.out.println(obj.abc()+" : "+obj.getAge());
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}
