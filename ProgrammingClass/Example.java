class Example {
	public static void main(String args[]){
		System.out.println("Hello");
		System.out.println(23+45+"Hello"+23+45);
		System.out.println(2*3+"Hello"+2*3);
		//System.out.println(4+5+"Hello"+4-5); //Error
		System.out.println(4+5+"Hello"+(4-5));
		//System.out.println(4*5+"Hello"*4+5); //Error
		String s = 78 + "Raju";
		System.out.println(s);
	}

}