class parent{
	{
		System.out.println("init block of the parent class");
	}
	parent(){
		System.out.println("inside the constructor of parent class");	
	}
	static {
		System.out.println("static block of parent class");
	}
	static {
		System.out.println("it is the second static block of parent class");
	}
}


class initBlock extends parent{
	initBlock(){
		System.out.println("inside the constructor of chidren ");
	}
	{
		System.out.println("inside the init block of the code");
	}
	
	static {
		System.out.println("static block of children class");
	}


	// overriding the toString  method to get value of my name
	
	public String toString(){
		
		return getClass().getName()+"PANKAJ"+Integer.toHexString(6657946567);
	}

	public static void main(String ...args){
		initBlock b = new initBlock();
		System.out.println(b);
	}
}
