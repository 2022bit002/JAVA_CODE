import java.util.Stack;

class stack{
	public static void main(String args[]){
		Stack<Integer> s = new Stack<>();
		
		boolean result;
		
		s.push(23);
		s.push(343);
		s.push(8112);
		s.push(434);
		
		result=s.empty();
		System.out.println("is the stack empty \n"+result);
		System.out.println("the element in the stack are :  \n"+s);
		
	}
}
