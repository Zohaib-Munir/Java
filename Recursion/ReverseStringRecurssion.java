import java.util.*;
public class ReverseStringRecurssion{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String : ");
		String name = input.nextLine();
		String result = reverseString(name);
		System.out.print(result);
	}
	public static String reverseString(String userInput){
		if(userInput.isEmpty()){
			return userInput;
		}
		else{
			System.out.print(userInput.charAt(userInput.length()-1));
			return reverseString(userInput.substring(0,userInput.length()-1));
		}
	}
}