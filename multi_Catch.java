// once the exception is found it will not execute the remainnig code inside the try block


class multiCatchBlock{
	public static void main(String ...args){
		try{
		System.out.println(args[0]);
		Thread.sleep(2000);
		}
		/*catch(Exception e ){
			System.out.println("inside the exception class block");
		}
		
		if use exception class block above the given two excption this will result as the below result are already caught  */
		
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("inside the arrayindexoutofboundsexception block");
		}
		catch(InterruptedException i){
			System.out.println("inside the Interrupteed Exception  block");
		}
		
		//  but if use the same after the given particular exception this will not cause any error
		//  this because the other exception except the one alredy caught above will be caught using the Exception calss but if we declare before it will caught the error and no use of the individual catch block. 
		
		catch(Exception e ){
			System.out.println("inside the exception class block");
		}
		finally{
			System.out.println("using multi catch block trying to find correct the exception and parent exception class order");
			}
		}
		}
