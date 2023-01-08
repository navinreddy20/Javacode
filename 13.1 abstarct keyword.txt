abstract class Car
{
//	public void drive()
//	{
//
//	}
	
	public abstract void drive();
	public abstract void fly();
	
	public void playMusic()
	{
		System.out.println("play music");
	}
}

abstract class WagnoR extends Car
{
//	public void fly()
//	{
//		System.out.println("Flying...");
//	}
	public void drive()
	{
		System.out.println("Driving...");
	}
}

class UpdateWagnoR extends WagnoR   //concrete class
{
	public void fly()
	{
		System.out.println("flying...");
	}
}

public class  Demo{
    public static void main(String[] args) {

 //   	Car obj=new Car();
 //   	Car obj=new WagnoR();
    	Car obj=new UpdateWagnoR();
    	obj.drive();
    	obj.playMusic();
    }
}

