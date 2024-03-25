import java.util.Scanner;

class oop1{
	public static void main(String args []){
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of index in an array");
		int n = s.nextInt();
		int a[] = new int[n];   
		System.out.println("enter the number in the array : ");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+a[i];
		}
		System.out.println("total sum of the nummber in the index are : ");
		System.out.println(sum);
	}
}
