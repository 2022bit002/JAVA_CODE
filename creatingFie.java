import java.io.*;
import java.lang.Exception;


class fileUsingCreateFileMethod{
	public static void main (String args[]){
		try{
			File w = new File("dhoran.txt");
			w.createNewFile();
			System.out.println("file created successfully");
		}
		
		catch(Exception e){
			System.out.println("An error occured ");
		}
	} 
}

