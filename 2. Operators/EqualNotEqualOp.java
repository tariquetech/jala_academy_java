class EqualNotEqualOp {
	
	public static void main(String[] args){
         
        // Variables
        int number1 = 5;
        int number2 = 10;
        int number3 = 5;

        // Equal Operator (==)
        System.out.println("Equal Operator (==):");
        System.out.println(number1 + " == " + number2 + " : " + (number1 == number2)); // Output: false
        System.out.println(number1 + " == " + number3 + " : " + (number1 == number3)); // Output: true
        System.out.println();

        // Not Equal Operator (!=)
        System.out.println("Not Equal Operator (!=):");
        System.out.println(number1 + " != " + number2 + " : " + (number1 != number2)); // Output: true
        System.out.println(number1 + " != " + number3 + " : " + (number1 != number3)); // Output: false

	}

}


