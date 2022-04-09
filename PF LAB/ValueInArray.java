import java.util.*;
public class ValueInArray{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arrayMethod1 = intilizatizationOfArray();
		int[] arrayMethod2 = checkValueInArray(arrayMethod1);
		displayNewArray(arrayMethod2);
	}
	public static int[] intilizatizationOfArray(){
		System.out.print("Enter Size Of Array : ");
		int sizeOfArray = input.nextInt();
		int[] array = new int[sizeOfArray];
		for(int i=0; i<array.length;i++){
			System.out.print("Enter Value In Array At "+(i+1)+" : ");
			array[i]=input.nextInt();
		}
	return array;
	}
	public static int[] checkValueInArray(int[] array2){
		int count=1;
		System.out.println();
		System.out.print("Enter Value To check In Array : ");
		int valueToCheck = input.nextInt();
		for(int i=0;i<array2.length;i++){
			if(array2[i]==valueToCheck){
				count=0;
			}
		}
		if(count==0){
			System.out.println("*********************************************");
			System.out.print("Value "+valueToCheck+" Is Found in Array\n");
		}
		else{
			System.out.println();
			System.out.print("Value"+valueToCheck+" Is Not Found in Array\n");
		}
	return array2;
	}
	public static void displayNewArray(int[] array3){
		System.out.println("*********************************************");
		for(int i=0;i<array3.length;i++){
			System.out.print(array3[i]+" ");
		}
	}
}