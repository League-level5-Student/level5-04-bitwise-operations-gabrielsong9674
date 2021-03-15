package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		// 1. Jot down the value of num in binary.
		int num = 4;
		int numShifted = num << 2;
		System.out.println(numShifted);

		// 2. Print the value of numShifted, and convert that value to binary.
		for ( int i = 0; i < 5; i ++) {
		numShifted = numShifted << 1;
		System.out.println(numShifted);

		}
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		
		// 4. Try shifting num 3 places.
		numShifted = num << 3;
		System.out.println(numShifted);
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
