class exception{
	public static void main(String ...args){
		try{
		System.out.println(args[0]);
		System.out.println(args[1]);
		}
		catch(Exception e ){
			System.out.println("array out of bound index");
		}
		finally{
			System.out.println("command line arguments are used hence what ever is given as the argument at the time of runing the code will be printed as the code");
		}
		
		}
}

/*  RESULT : 01
pankaj@pankaj-VivoBook-ASUSLaptop-M1603QA-M1603QA:~/JP$ java exception command line
command
line
command line arguments are used hence what ever is given as the argument at the time of runing the code will be printed as the code

   RESULT : 02
 pankaj@pankaj-VivoBook-ASUSLaptop-M1603QA-M1603QA:~/JP$ java exception 
array out of bound index
command line arguments are used hence what ever is given as the argument at the time of runing the code will be printed as the code


Command Line Arguments:

These are the values provided to a program or script when it is executed from the command line or terminal.

Command Line Parameters:

These are essentially the same as command line arguments but can refer to the parameters expected by a program or script.


