/*

	there are 2 types of exception 
		1. User-defined exception
		2. Builtin exception
	there are two types of exception in builtin exception
	a. Checked Exception
	b. Unchecked Exception
	
	a. Checked Exception : the one that occur at the time of compilation can be called compile time exception.
	b. Unchecked Exception : this is exactly opposite to the checked exception.
	
	*/
	
	//   checked exception
	 // example is ClassNotFound exception
	 
	 //Unchecked Exception
	 
	 class exception {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Attempting to access an index that doesn't exist
        int index = 10;
        try {
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // This exception is unchecked and doesn't require handling,
            // but we can still catch and handle it if needed.
            System.err.println("Array index out of bounds!");
            e.printStackTrace();
        }
        
        // This code will continue executing after the catch block
        System.out.println("This an example of Unchecked Exception...S");
    }
}
 
