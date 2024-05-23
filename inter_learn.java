interface learn{
	void pen();
	void color_pen();
	void price();
}



class shop_1{
	void pen(){
		System.out.println("It is a Apsara pencil");
	}
	public static void main(String ... args){
		shop_1 s = new shop_1();
		s.pen();
	}
}
