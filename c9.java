import java.util.*;

class c9{
	public static void main(String args[]){
		String name ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name in string : ");
		name = s.next();
		String empty = "";
		char a;
		for(int i =(name.length()-1);i>=0;i--){
			a=name.charAt(i);
			empty = empty+a;
		}
		System.out.println(empty);
		if(name.equals(empty)){
			System.out.println("It is an palindrome");
		}
		else{
			System.out.println("It is not an palindrome");
		}
	}
}
