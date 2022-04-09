//Importing required files
import java.util.*;
public class Menu{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String number1=null;
		String number2=null;
		System.out.print("1 : Addition\n"+
						 "2 : Subtraction\n"+
						 "3 : Division\n"+
						 "4 : Absolute Value/Modulus\n"+
						 "5 : Binary\n"+
						 "0 : Exit\n");
		System.out.print("Select Option : ");
		String option = input.nextLine();
		while(Checks(option)){
			System.out.print("Enter Again : ");
			option = input.nextLine();
		}
		if(!Checks(option)){
			int optionNew = Integer.parseInt(option);
			if(optionNew==0){
				System.exit(0);
			}
		}
		do{
			System.out.print("Enter Number 1 : ");
			number1 = input.nextLine();
			System.out.print("Enter Number 2 : ");
			number2 = input.nextLine();
		}while(Checks(number1) || Checks(number2));
		switch(option){
		case "1":   int result = additionOfNumbers(number1,number2);
			System.out.print("Sum of Number is : "+result);
			break;
		case "2": result = subtractionOfNumbers(number1,number2);
			System.out.print("Difference of Number is : "+result);
			break;
		case "3": result = divisionofNumbers(number1,number2);
			System.out.print("Division Of Number is "+result);
			break;
		case "5": decimalToBinary(number1);
			break;
		default : System.out.print("Thank You\n"+
								   "Option is Greater Than 12");
		}
	}
	static boolean Checks(String option1){
		boolean specialCharCheck = false;
		String specialCharacter = "\"\"!#$%&'()*+,-./:;<=>?@[]^_`{|}~"+
		"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i =0; i<option1.length();i++){
			char newOptionInChar = option1.charAt(i);
			String newOptionInString = Character.toString(newOptionInChar);
			if(specialCharacter.contains(newOptionInString)){
				specialCharCheck=true;
			}
			else{
				specialCharCheck=false;
			}
		}
		return specialCharCheck;
	}
	static int additionOfNumbers(String n1,String n2){
        int n3 = Integer.parseInt(n1);
        int n4 = Integer.parseInt(n2);
        int sum = n3+n4;
        return sum;
    }
    static int subtractionOfNumbers(String n1, String n2){
        int n3 = Integer.parseInt(n1);
        int n4 = Integer.parseInt(n2);
        int dif = n3-n4;
        return dif;
    }
    static int divisionofNumbers(String n1, String n2){
    	int n3 = Integer.parseInt(n1);
        int n4 = Integer.parseInt(n2);
        int div = n3/n4;
        return div;
    }
    static void decimalToBinary(String n1){
    	int num = Integer.parseInt(n1);
		while(num>0){
			int bin = num%2;
			num = num/2;
			System.out.print(bin);
		}
	}
}
