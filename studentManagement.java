
///     Write a program for student Management System with attributes Name Roll number and Marks which do following operation add student remove student search display full list


import java.util.*;

class Student{
	private String stuName;
	private String stuRoll;
	private float stuCgpa;
	
	Student(String stuName , String stuRoll , float stuCgpa){
		this.stuName = stuName;
		this.stuRoll = stuRoll;
		this.stuCgpa = stuCgpa;
		}
		
	String getName(){
		return stuName;
	}
	
	String getRoll(){
		return stuRoll;
	}
	
	float getCgpa(){
		return stuCgpa;
	}
	
	public String toString(){
		return "Student [ Name : "+stuName+", Roll number : "+stuRoll+", CGPA : "+stuCgpa+"]";
	}
	
}

class studentMangement{
	
	
	
	public static void main(String ...args){
		
		
		        	
		ArrayList<Student> stu = new ArrayList<>();
		
		studentMangement sm = new studentMangement();
		
		
		Scanner s = new Scanner(System.in);
		int choice;
		
		do{
			System.out.println("Enter as per requirment");
			System.out.println("1 : to ADD");
			System.out.println("2 : to REMOVE");
			System.out.println("3 : to SEARCH");
			System.out.println("4 : to DISPLAY");
			System.out.println("5 : to EXIST");
			
		        choice = s.nextInt();
		        
		        switch (choice){
		        	case 1:
					System.out.println("Adding an student :");
					System.out.println("Enter the name :");
					String stuName = s.nextLine();
					stuName= s.nextLine();
					System.out.println("Enter the Roll number :");
					String stuRoll = s.next();
					System.out.println("Enter the CGPA :");
					float stuCgpa = s.nextFloat();
					stu.add(new Student(stuName,stuRoll,stuCgpa));
					break;
		        	
		        	case 2: 
					System.out.println("Enter the roll no to be deleted");
					String stuRollDel = s.next();
					try{
					for (Student student : stu){
						if(student.getRoll().equals(stuRollDel)){
							stu.remove(student);
						}
					}}
					catch(Exception e){}
					
					
					break;
		        	
		        	case 3: 
					System.out.println("Enter the roll no to be searched");
					String stuRollSer = s.next();
				        for (Student student : stu){
						if(student.getRoll().equals(stuRollSer)){
							System.out.println(student);
						}
					}
					
		
					break;
		        	
		        	case 4: 
					System.out.println("Displaying all the student");
					for (Student student : stu){
						System.out.println(student);
					}
					
					break;
					
				default :
					System.out.println("you have choosen wrong answer");	
		        	
		        }
		        
		}while(choice != 5);
		
		
	}
}
