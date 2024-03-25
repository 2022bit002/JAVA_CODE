class marks{
    void maths(){
        float total =67;
        System.out.println(total+"maths");
    }
    void english(){
        float total = 90;
        System.out.println(total+"english");
    }
}

class student extends marks {  //extends keyword is use to inherit the parent class.
    void result (){
        System.out.println("you are passed in maths and english");
    }
}


public class single {
    public static void main(String[] args) {
        student s = new student();
        s.maths();
        s.english();
        s.result();
    }

    
}


class grandparent{  // first level of inheritance 
    void garnd(){
        System.out.println("hi i am the grandparent");
    }
}

class parent extends grandparent{   // first level of inheritance 
    void prnt(){
        System.out.println("hi i ma the parent");
    }
}

class child extends parent {      // second level of inheritance 
    void boy(){
        System.out.println("hi i am the child");
    }
}
public class multilevel {
    public static void main(String[] args) {
        child c = new child();
        c.garnd();;
        c.prnt();
        c.boy();
        
        
    }
    
}
