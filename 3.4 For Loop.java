public class hello {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			System.out.println("Hi"+i);
		}
		
		
		for(int i=1;i<=7;i++)
		{
			System.out.println("Day"+i);
			for(int j=1;j<=9;j++)
			{
				System.out.println(" "+(j+8)+"-"+(j+9));
			}
		}
		
		
		int i=1;
		for(;i<=5;)
		{
			System.out.println("DAY"+i);
			i++;
		}
	}
}
