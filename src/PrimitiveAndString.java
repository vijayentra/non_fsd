
public class PrimitiveAndString {

	public static void main(String[] args) {
		byte x = 100;
		
		String s = Byte.toString(x);
		
		Byte y = Byte.parseByte(s);
		
		System.out.println(s);
		System.out.println(y);
		

	}

}
