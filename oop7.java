class oop7{
	 String name;
         int roll_No;

    //parameter are passsed to the constructor to default constructor to make it parameterised constructor 
    parameterized_Constructor(int a, String b){
        name = b;
        roll_No = a;

    }

    void display(){
         
        System.out.println("Name : "+name+"\n"+"Roll No : "+roll_No);
    }

    public static void main(String[] args) {
        parameterized_Constructor C = new parameterized_Constructor(2022002, "Pankaj");
        C.display();
    }
}
