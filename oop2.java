import java.util.Scanner;

class oop2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string : ");
		String a = s.next();
		System.out.println("the length of the string is : "+ a.length());
		System.out.println("substring of the string is : "+ a.substring(1,5));
		System.out.println("the character at the index number 0 is :"+ a.charAt(0));
		System.out.println("if the String is empty or not : "+ a.isEmpty());
		System.out.println("change it to upper case : "+ a.toUpperCase());
	}
}
