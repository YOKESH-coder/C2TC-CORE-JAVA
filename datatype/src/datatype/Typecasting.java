package datatype;

public class Typecasting {

	public static void main(String[] args) {
		//widening casting (or) implicit casting--smaller to bigger(automatic)
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		float f = 22.14f;
		double d = f;
		System.out.println(d);
		
		char c = 'A';
		int i1 = c;
		System.out.println(i1);
		
		int i2 = 100;
		double d1 = i2;
		System.out.println(d1);
		
		char c1 = 'a' + 10;
		double d2 = c1;
		System.out.println(d2);
		
		//narrowing casting (or) explicit casting--bigger to smaller
		double d3 = 10.52f;
		long l = (long)d3;
		System.out.println(l);
		
		float f1 = 100.200f;
		int i3 = (int)f1;
		System.out.println(i3);
		
		long l1 = 214793939;
		int i4 = (int)l1;
		System.out.println(i4);
		
		byte b1 = 90;
		char c2 = (char)b1;
		System.out.println(c2);
	}
	

}
