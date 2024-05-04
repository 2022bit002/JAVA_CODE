import java.io.*;
import java.lang.Exception;


class fileUsingBufferedWriter{
	public static void main (String args[]){
		try{
			BufferedWriter w = new BufferedWriter(new FileWriter("pankaj.txt"));
			w.write("hey i am pankaj and iam learning file handling");
			w.close();
			System.out.println("file created successfully");
		}
		
		catch(Exception e){
			System.out.println("An error occured ");
		}
	} 
}

