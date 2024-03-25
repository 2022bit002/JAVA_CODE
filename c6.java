import java.util.*;

class c6{
	public static void main(String args[]){
		System.out.println("enter the number of index in an array ");
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter the number at index number :"+i);
			a[i]= s.nextInt();
		}
		System.out.println("the numbers in array are :");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
}
