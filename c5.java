import java.util.*;

class c5{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the nunmber whose factorial has to be find : ");
		int a = s.nextInt();
		int c=1;
		for(int i=a;i>0;i--){
			c=c*a;
			--a;
		}
		System.out.println(c);
	
	}
}
