class funOverAmbigiuty{

	static void sum(int a , long b){
		System.out.println("this is sum1");
		
	}
	
	static void sum(long a, int b){
		System.out.println("this is sum2");
	}
	
	public static void main(String ...args){
		sum(10,10l);
	}

}
