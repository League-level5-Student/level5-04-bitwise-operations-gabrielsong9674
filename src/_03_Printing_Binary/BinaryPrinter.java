package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		byte b = 10;
		printByteBinary(b);
		printIntBinary(11);
	}
	
	public static void printByteBinary(byte b) {
		System.out.println(b);
	}
	
	public void printShortBinary(short s) {
		
	}
	
	public static void printIntBinary(int i) {
		System.out.println(_00_Binary_Conversion.DecimalToBinary.convertDecimalToBinary(i));
	}
	
	public void printLongBinary(long l) {
		
	}
}
