class bike{
    void run(){
        System.out.println("running ");
    }
}

public class runtimePolymorphism extends bike {
    void run(){
        System.out.println("safely running ");
    }

    public static void main(String[] args) {
        bike b = new runtimePolymorphism();  //this is upcasting
        b.run();
    }
    
}
