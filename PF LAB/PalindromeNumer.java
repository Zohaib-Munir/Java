import java.util.*;
public class PalindromeNumer{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		int number = input.nextInt();
		checkPalindromeNumber(number);

	}
	public static void checkPalindromeNumber(int newNumber){
		if(newNumber==0){
			return;
		}
		int reverseNumber = newNumber%10;
		reverseNumber+=reverseNumber;
		newNumber = newNumber/10;
		checkPalindromeNumber(newNumber);
	}
}