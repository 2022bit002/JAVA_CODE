class except{
	public static void main(String args[]){
		int [] arr={};
		try{
			int a = arr[1];
			System.out.println(a);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("it is an out of bounds exception");
		}
		catch(Exception e){
			System.out.println("it is an out of bounds exception");
		}
		finally{
			System.out.println("finally is executed wheather exception is catched or not it always  execute");
		}
	}
}
