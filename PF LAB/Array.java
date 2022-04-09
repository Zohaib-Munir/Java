import java.util.*;
public class Array{
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int[] newArray = arrayInitialize();
		int [] insertValueArray = valueDeletion(newArray);
		//insertValue(insertValueArray);
	}
	public static int[] arrayInitialize(){
		System.out.print("Enter Size of Array : ");
		int arraySize = input.nextInt();
		int[] array1 = new int[arraySize]; 
		for(int i=0; i<array1.length;i++){
			System.out.print("Enter Value At "+(i+1)+" : ");
			array1[i]=input.nextInt();
		}
		return array1;
	}
	public static int[] valueDeletion(int[] userArray){
		System.out.println(userArray);
		System.out.print("Enter Value You Want To Delete : ");
		int deleteValue= input.nextInt();
		//int count =0;
		for(int i=0;i<userArray.length;i++){
			if(deleteValue==userArray[i]){
				for(int j=i;j<userArray.length-1;j++){
					userArray[j]=userArray[j+1];
				}
				//count++;
				break;
			}
		}
		//if(count==0){
			//System.out.println("Element Not Found ");
		//}
		//else{
			//System.out.println("Element Found And Deleted ");
			for(int i=0;i<userArray.length-1;i++){
				System.out.print(userArray[i]+" ");
			}
		//}
			System.out.println();
			System.out.println(userArray.length);
		return userArray;
	}
	public static void insertValue(int [] array2){
		int checkValue;
		for(int i=0;i<array2.length;i++){
			checkValue=array2[i];
			if(checkValue==0){
				System.out.println("Space Available At "+(i+1)+" : ");
			}
			else{
				System.out.println("No Spcae");
			}
		}
	}
}