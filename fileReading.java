import java.io.*;
import java.lang.Exception;
import java.util.*;


class fileReading{
	public static void main (String args[]){
		try{
			File w = new File("dhoran.txt");
			Scanner s = new Scanner(w);
			while (s.hasNextLine()){
				String a = s.nextLine();
				System.out.println(a);
			}
			s.close();
			
		}
		
		catch(Exception e){
			System.out.println("An error occured ");
		}
	} 
}

