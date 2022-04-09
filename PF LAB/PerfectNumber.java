import java.util.*;
public class PerfectNumber{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Number : ");
		int number = input.nextInt();
		listOfPerfectNumbers(number);
		if(checkPerfectNumber(number)){
			System.out.print(" Number "+number+" Is Perfect Number");
		}
		else{
			System.out.print(" Number "+number+" Is Not Perfect Number");
		}

	}
	public static boolean checkPerfectNumber(int userNumber){
		int sum=0;
		for(int i=1;i<userNumber;i++){
			if(userNumber%i==0){
				//System.out.print("Value Of I"+i);
				sum= sum + i;
			}
		}
		if(sum==userNumber){
			return true;
		}
		System.out.print(sum);
		return false;
	}
	public static void listOfPerfectNumbers(int number){
		for(int i=1; i<=number;i++){
			int newSum=0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					newSum=newSum+j;an
				}
			}
			if(newSum==i){
				System.out.print(newSum+",");
				}
		}
	System.out.println();
	}
}