import java.util.Scanner;
class c4{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = s.nextInt();
		System.out.println("enter the second number");
		int b = s.nextInt();
		
		if(a>b){
			System.out.println("a is greater than b");
		}
		else{
		if(b>a){
			System.out.println("b is greater than a");
		}
		else{
			System.out.println("both are equall");
		}}
		
}}
