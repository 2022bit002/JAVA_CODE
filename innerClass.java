class outer{

	static int age=67;
	String name;
	class inner{
	
		static int age =78;
		String name;
		public static void main(String ...args){
			System.out.println(age);
		}
	}
	
	public static void main(String ...args){
		outer o = new outer();
		inner n = o.new inner();
		o.name = "Pankaj";
		n.name = "Mayur";
		System.out.println(o.name);
		System.out.println(n.name);
		System.out.println(age);
		String [] a={};
		
		n.main(a);
	}
}
