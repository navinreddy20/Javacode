public class Demo {
    public static void main(String[] args) {
    	
//    	int i=2;
    	int i=0;
    	int j=0;
 
    	
    	try
    	{
    		j=18/i;
    		if(j==0)
    			throw new ArithmeticException("I don't want to do print zero");
    	}

    	catch(ArithmeticException e)
    	{
    		j=18/i;
    		System.out.println("that is default output"+e);

//    		System.out.println("Cannot divide by zero");
    	}
    	
    	catch(Exception e)
    	{
  
    		System.out.println("Something went wrong."+e);
    	}
    	System.out.println(j);
    	System.out.println("Bye");
    }
}

