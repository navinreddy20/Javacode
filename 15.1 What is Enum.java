enum Status{
	Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args) {

    	int i=5;
//    	Status s= Status.Running;
//    	Status s= Status.Failed;
//    	Status s= Status.NoIdea;
//    	Status s= Status.Success;
    	
//    	System.out.println(s);
//    	System.out.println(s.ordinal());
    	
    	Status[] ss=Status.values();
    	System.out.println(ss);
    	
    	for(Status s:ss)
    	{
    		System.out.println(s);
    		System.out.println(s+" : "+s.ordinal());
    	}
    	
    	
        
    }
}