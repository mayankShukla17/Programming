class Example1
{
	public static void main(String[] args)
	{
		System.out.println("MMS");
		fun();
		System.out.println("MME");
		/*
		Example1 e1 = new Example();
		e1.fun();		
		if method is static no need to create object 
		*/
	}
	
	static void fun(){
		System.out.println("FMS");
		System.out.println("---------");
		System.out.println("FME");
	}
}