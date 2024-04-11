class outerclass{
	String name;
	void namegiven(String name){
		this.name = name;
		System.out.println("this name inside method of outer class : "+name);
	}
	
	class innerclass{
		String surname;
		void surnamegiven(String surname){
			this.surname = surname ;
			System.out.println("this is surname inside method of inner class : "+ surname);
		}
	}
	
	static  class nestedclass{
		nestedclass(){
			System.out.println("this an nested class staic has been used while declaration");
		}
	}
	
	public static void main(String args[]){
		outerclass o = new outerclass();
		innerclass i = o.new innerclass();
		nestedclass c = new nestedclass();
		o.namegiven("PANKAJ");
		i.surnamegiven("DHORAN");
	}
	
	
}


class aim{
	static {
		System.out.println("this is outer class static block");
	}

	class insideAim{
		static {
		System.out.println("this is inner class static block");
	}
	{
		System.out.println("this is outer class init block");
	
	}
	public static void main(String args[]){
		System.out.println("main of inner class");
	}
	}
	
	public static void main(String args[]){
		aim a = new aim();
		insideAim e = a.new insideAim();
		String an[] ={};
		e.main(an);
	}

}
