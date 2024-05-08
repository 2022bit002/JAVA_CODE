import java.io.*;
import java.lang.Exception;


class fileWriting{
	public static void main (String args[]){
		try{
			FileWriter w = new FileWriter("dhoran.txt");
			w.write("this file was made bby pankaj\n");
			w.write("file written successfully");
			w.close();			
		}
		
		catch(Exception e){
			System.out.println("An error occured ");
		}
	} 
}

