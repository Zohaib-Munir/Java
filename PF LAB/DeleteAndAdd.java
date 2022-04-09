import java.util.*;
public class DeleteAndAdd{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int[] returnArray = initializeArray();
		int[] secondArray =deleteValue(returnArray);
		int[] thirdArray= printArray(secondArray);
		addValueinArray(thirdArray);
	}
	public static int[] initializeArray(){
		System.out.print("Enter Size Of Array : ");
		int sizeOfArray = input.nextInt();
		int[] array = new int[sizeOfArray];
		for(int i=0; i<array.length;i++){
			System.out.print("Enter Value At "+(i+1)+" : ");
			array[i]=input.nextInt();
		}
	return array;
	}
	public static int[] deleteValue(int[] array1){
		System.out.print("Enter Value You Want To Delete: ");
		int deleteValue = input.nextInt();
		for(int j=0;j<array1.length;j++){
			if(deleteValue==array1[j]){
				array1[j]=0;
			}
		}
	return array1;
	}
	public static int[] printArray(int[] array2){
		for(int i=0;i<array2.length;i++){
			if(array2[i]==0){
				continue;
			}
			else{
				System.out.print(array2[i]+" ");
			}
		}
		return array2;
	}
	public static void addValueinArray(int[] array3){
		System.out.println();
		System.out.print("Enter Value To Add In Array : ");
		int valueInArray = input.nextInt();
		for(int i=0; i<array3.length;i++){
			if(array3[i]==0){
				array3[i]=valueInArray;
			}
		}
		for(int j=0;j<array3.length;j++){
			System.out.print(array3[j]+" ");
		}
	}
}