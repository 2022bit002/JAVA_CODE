interface learn{
	void name();
	void surname();
}

class interLearn implements learn{
	public void name(){
		System.out.println("Pankaj");
        }
	public void surname(){
		System.out.println("Dhoran");	
	}
	public static void main(String ...args){
		interLearn p = new interLearn();
		p.name();
		p.surname();
	}
 
}
