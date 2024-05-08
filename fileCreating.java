import java.io.*;
import java.lang.Exception;

	class FileHandling {
		public static void main (String args[]){
			try{
				File f = new File("pankaj.txt");
				System.out.println("File is created successfully : "+f.getName());
			}
			catch (Exception e){
				System.out.println("An error occured");
				e.printStackTrace();
			}
		}
	
	}
