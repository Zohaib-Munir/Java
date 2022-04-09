import java.util.*;
public class Recurssion{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String: ");
		String userString = input.nextLine();
		if(checkPalindrome(userString)){
			System.out.print("String Is Palindrome");
		}
		else{
			System.out.print("String Is Not Palindrome");
		}
	}
	public static boolean checkPalindrome(String userValue){
		if(userValue.length()==0 || userValue.length()==1){
			return true;
		}
		if(userValue.charAt(0) == userValue.charAt(userValue.length()-1)){
			return checkPalindrome(userValue.substring(1,userValue.length()-1));
		}
		return false;
	}
}