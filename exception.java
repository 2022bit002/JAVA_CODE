

class exception{

	void error() throws pankaj {
		throw new pankaj("this is using run time exceptionn class");
	}

	public static void main (String ...args){
		try{
			exception e = new exception();
			e.error();
			
		}
		catch (pankaj p){
			System.err.println("are u ready");
			System.out.println("pankaj is throwing an error \n"+p);
			StackTraceElement [] t = p.getStackTrace();
			
			System.err.println(t[0].toString());
		
		}
	} 
}

class pankaj extends RuntimeException{
	pankaj(String msg){
		super(msg);
	}
}
