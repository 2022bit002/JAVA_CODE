import java.util.*;

class Faculty{
	private String name;
	private String regNo;
	
	Faculty(String name , String regNo){
		this.regNo = regNo ;
		this.name = name ;
	} 
	
	String getName(){
		return name;
	}
	
	String getReg(){
		return regNo ; 
	}
	
	public String toString(){
		return "FACULTY { Name : "+name+"{ Roll no : "+regNo+"}" ;
	}
	
}


class Department {
	
	
	static List<Faculty> f = new ArrayList<>();
	
	
	static Faculty getFaculty(String fname){
		for (Faculty fa : f){
			if (fa.getName().equals(fname)){
				return fa;
			}
			else {
				 throw new Exception() ;
				 return fa;
			}
		}
	}
	
	public static void main(String ...args){
		
	}
}
