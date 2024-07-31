public class hello {

	public static void main(String[] args) {
		int i=1;
		
//		while(true)
//		{
//			System.out.println("Hi"+ i);
//			i++;
//		}
		
		
//		while(i<=4)
//		{
//			System.out.println("Hi"+ i);
//			i++;
//		}
//		System.out.println("Bye"+i);

		
		while(i<=4)
		{
			System.out.println("Hi"+ i);
			int j=1;
			while(j<=3) {
				System.out.println("Hello"+j);
				j++;
			}
			i++;
		}
		System.out.println("Bye"+i);
	}
}
