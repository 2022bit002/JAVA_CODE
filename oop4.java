public class obj_IntiasliseByMethod {
    int rollNo;
    String name;

    void insertRecord(int r, String n) {
        rollNo = r;
        name = n;
    }

    void showRecord() {
        System.out.println("Name is :" + name);
        System.out.println("Roll no. is " + rollNo);
    }


 class mainOutside 
 {
    //main is present outside the class
    public static void main(String[] args) {
        obj_class_MainOutsideClass s1=new obj_class_MainOutsideClass ();  
        obj_class_MainOutsideClass s2=new obj_class_MainOutsideClass ();  
        s1.insertRecord(111,"Karan");  
        s2.insertRecord(222,"Aryan");  
        s1.showRecord();  
        s2.showRecord();
        
    }

}
}
