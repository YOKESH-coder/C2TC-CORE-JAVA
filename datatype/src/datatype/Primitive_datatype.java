package datatype;

public class Primitive_datatype {

	public static void main(String[] args) {
		//byte = 1 byte
		byte byteMax = 127;
		byte byteMin = -128;
		System.out.println(byteMin);
		System.out.println(byteMax);
	
		//short = 2 bytes
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println(shortMin);
		System.out.println(shortMax);
	
		//int = 4 bytes
		int intMax = 2147483647;
		int intMin = -2147483648;
		System.out.println(intMin);
		System.out.println(intMax);
		
		//float = 4 bytes
		System.out.println("min Float = " + Float.MIN_VALUE);
		System.out.println("max float = " + Float.MAX_VALUE);
	
		//long = 8 bytes
		System.out.println("min long = " + Long.MIN_VALUE);
		System.out.println("max long = " + Long.MAX_VALUE);
		
		//double = 8 bytes
		System.out.println("max double = " + Double.MAX_VALUE);
		System.out.println("min double = " + Double.MIN_VALUE);
	
	}

}
