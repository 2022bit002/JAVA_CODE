import java.util.Scanner;


class array{
	public static void main(String args[]){
	
		Scanner g = new Scanner(System.in);
		System.out.println("enter the element in array");
		int[] arr = new int[5];  // declare 1
		for(int i=0; i<5 ; i++){
			arr[i]= g.nextInt();
		}
		System.out.println("printing the array : ");
		for(int b : arr){
			System.out.println(b);
		}	
		
		
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
		
		System.out.println("the second type of declaration is:");
		int a[] = new int[4];    //  declare 2
		System.out.println("enter the element in array");
		
		for(int i=0; i<4 ; i++){
			a[i]= g.nextInt();
		}
		System.out.println("printing the array : ");
		for(int b : a){
			System.out.println(b);
		}	
		
	}
}
