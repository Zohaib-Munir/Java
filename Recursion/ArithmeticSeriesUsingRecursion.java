import java.util.*;
public class ArithmeticSeriesUsingRecursion{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Limit For Series :");
		int userNumber = input.nextInt();
		System.out.print("Enter Common Difference : ");
		int diff = input.nextInt();
		int size = userNumber/diff;
		int[] array = new int[size];
		int[] result = arithmeticseries(userNumber,0,0,array,diff);
		for(int i=0; i<array.length;i++){
			System.out.print(result[i]+" ");
		}
	}
	public static int[] arithmeticseries(int limitNumber,int startNumber,int indexController,int[] array1,int cdiff){

		if(limitNumber<=1){
			return array1;
		}
		else{
			int newNumber = startNumber + cdiff;
			array1[indexController]=newNumber;
			indexController++;
			startNumber=newNumber;
			arithmeticseries(limitNumber-cdiff,startNumber,indexController,array1,cdiff);
		}
		return array1;
	}
}