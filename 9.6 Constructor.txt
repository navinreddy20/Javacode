class Human
{
	private int age;
	private String name;
	
	public Human()
	{
		age=12;
		name="John";
		//System.out.println("in constructor");
	}
	public int getAge(){
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		Human obj1=new Human();
		System.out.println(obj.getName()+" : "+obj.getAge());
		
		obj.SetAge(30);
		obj.setName("Reddy");
		

		//System.out.println(obj.getName()+" : "+obj.getAge());
	}
}


