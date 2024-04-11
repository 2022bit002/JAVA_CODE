

class engineeringCalci {


  public static float add(float p, float q) { 
    float r = p + q;
    return r; 
  }

  public static float sub(float p, float q) { 
    float r;
    r = p - q;
    return r; 
  }

  public static float mul(float p, float q) { 
    float r;
    r = p * q;
    return r; 
  }

  public static int div(int p, int q) throws Exception{ 
   // try{
    if (q == 0) 
    {
    	
    	throw new CalculatorException("a number can not be divided by zero");
    } else {
      int r;
      r = p / q;
      return r; 
    }
    //}
    
    /*catch(CalculatorException c){
    	System.out.println("Enter a number greater than ZERO");
    	return 0;
    }*/
  }

  public static int mod(int p, int q) {
    int r;
    r = p % q;
    return r; 
  }

  public static float sqr(float p) { 
    float r;
    r = p * p;
    return r; 
  }
  
  public static double sin(double p){
	double q = Math.sin(p);
	return q;  
  }
  
  public static double cos(double p){
	double q = Math.cos(p);
	return q;  
  }

  public static void main(String args[]) throws Exception{

    engineeringCalci c = new engineeringCalci();
    System.out.println(div (2312,0));
    System.out.println(mul(-12,2));
    System.out.println(mod(1232,33));
    System.out.println(sin(1.58));
     System.out.println(cos(1.5));

  }

}



class CalculatorException extends Exception{
	CalculatorException(String error){
		super(error);
	}
}

