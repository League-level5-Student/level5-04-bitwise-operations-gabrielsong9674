package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		byte b = (byte)234;
		printByteBinary(b);
		short s = (short)256;
		System.out.println();
		printShortBinary(s);
		System.out.println();
		int i = 500;
		printIntBinary(i);
		System.out.println();
		long l = 1000;
		printLongBinary(l);
	}
	
	public static void printByteBinary(byte b) {
		//go through each bit
		System.out.print((b&0b10000000)>>7);
		System.out.print((b&0b01000000)>>6);
		System.out.print((b&0b00100000)>>5);
		System.out.print((b&0b00010000)>>4);
		System.out.print((b&0b00001000)>>3);
		System.out.print((b&0b00000100)>>2);
		System.out.print((b&0b00000010)>>1);
		System.out.print((b&0b00000001));
		System.out.print(" ");

	}
	
	public static void printShortBinary(short s) {
		//0000000100000000 - > 00000001 00000000
		byte firstByte = (byte) (s>>8);
		byte secondByte = (byte)(s&0x00FF);
		
		printByteBinary(firstByte);
		
		printByteBinary(secondByte);
		
	}
	
	public static void printIntBinary(int i) {
		short firstShort = (short)((i)>>16);
		short secondShort = (short)(i&0x0000FFFF); 
		
		printShortBinary(firstShort);
		printShortBinary(secondShort);
		
	}
	
	public static void printLongBinary(long l) {
		int firstInt = (int)(l>>32);
		int secondInt = (int)(l&0x00000000FFFFFFFF);
		printIntBinary(firstInt);
		printIntBinary(secondInt);
	}
}
