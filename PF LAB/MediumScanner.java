public class MediumScanner{
	public static void main(String[] args) {
		int number = 0XF;
		System.out.print(number+"\n");
		int x =(byte) 188;
		float f = 0.777f;
		int b = (int)12e2;
		boolean n = true;
		// simple Way for Char ;
		char ch2 = 'a';
		// Integral literlas for Char Value;
		char num1 = 97;
		//hexa System Number For Char;
		char ch = 0XFACE;
		// UniCode Value For Char Number Should be 4 digit Hexa Decimal Number; 
		char z = '\u0061';
		System.out.println("CH : "+ch);
		System.out.print("B : "+b);
		System.out.print("F : "+f);
		System.out.print("X : "+x);
		String name = "ZohaibMunir\r";
		System.out.println(name);
		char newChar = '\t';
		System.out.print("Escape :"+newChar);
		char newNAme = '\uFace';
		System.out.println(newNAme);
		System.out.println((int)newNAme);
	}
}