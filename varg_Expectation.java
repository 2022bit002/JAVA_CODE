//    exception that will be result as an index of an args  will tried to be used as agrs is empty array in main method parameter.
 

class varags{
	public static void main(String ...args)// Strinig [] args can also be written as given
	{
		try{
			System.out.println(args[0]);
			}
		catch(Exception e){
			System.out.println("args is empty array so it throw the out of bound exception");
		}
		finally{
			System.out.println("this blok excetes wheather we get error or not");
			
		}	
	}

}
