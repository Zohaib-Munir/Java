import java.util.*;
public class TypesOfNumberInArray{
	static Scanner input = new Scanner(System.in);
	static int sizeOfArray;
	public static void main(String[] args) {
		int[] arrayMethod1 = intilizatizationOfArray();
		checkNegativeNumbers(arrayMethod1);
		checkPositiveNumbers(arrayMethod1);
	}
	public static int[] intilizatizationOfArray(){
		System.out.print("Enter Size Of Array : ");
		sizeOfArray = input.nextInt();
		int[] array = new int[sizeOfArray];
		for(int i=0; i<array.length;i++){
			System.out.print("Enter Value In Array At "+(i+1)+" : ");
			array[i]=input.nextInt();
		}
	return array;
	}
	public static void checkNegativeNumbers(int[] array1){
		int temp=0;
		System.out.println("********************Checking Negative Numbers********************");
		for(int i=0;i<array1.length;i++){
			if(array1[i]<0){
			 temp=array1[i];
			 System.out.print(temp+" ");
			}
		}
		System.out.println();
	}
	public static void checkPositiveNumbers(int[] array2){
		int temp2=0;
		System.out.println("*******************Checking Positive Numbers********************");
		for(int j=0;j<array2.length;j++){
			if(array2[j]>0){
				temp2=array2[j];
				System.out.print(temp2+" ");
			}
		}
		System.out.println();
	}
}