import java.util.*;
public class Arrays2D{
	static int rows;
	static int col;
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arrayMethod1= arrayInitialize();
		int[][] arrayMethod2= printArray(arrayMethod1);
		int[][] arrayMethod3= sumOfColumns(arrayMethod2);
		int[][] arrayMethod4= swappingDiagnols(arrayMethod3);
		displayArray(arrayMethod4);
	}
	public static int[][] arrayInitialize(){
		System.out.print("Enter Rows of Array : ");
		rows = input.nextInt();
		System.out.print("Enter Columns of Array: ");
		col = input.nextInt();
		int[][] array1 = new int[rows][col]; 
		for(int i=0; i<array1.length;i++){
			for(int k=0;k<array1[0].length;k++){
				System.out.print("Enter Value At Row "+(i+1)+" And Col "+(k+1)+" : ");
				array1[i][k]=input.nextInt();
			}
		\}
		return array1;
	}
	public static int[][] printArray(int[][] array2){
		for(int i=0;i<array2.length;i++){
			int sum =0;
			for(int k =0;k<array2[0].length;k++){
				System.out.print(array2[i][k]+" ");
				sum = sum+array2[i][k];
			}
			System.out.print("Sum : "+sum);
			System.out.println();
		}
		System.out.println();
	return array2;
	}
	public static int[][] sumOfColumns(int[][] array3){
		for(int cols=0;cols<array3[0].length;cols++){
			int sumCol=0;
			for(int row=0;row<array3.length;row++){
				sumCol+=array3[row][cols];
			}
		System.out.print(sumCol+" ");
		}
		System.out.println("\n");
	return array3;
	}
	public static int[][] swappingDiagnols(int[][] array4){
		int temp=0;
		for(int j=0;j<array4.length;j++){
			temp=array4[j][j];
			array4[j][j]=array4[j][col-1-j];
			array4[j][col-1-j]=temp;
		}
	return array4;
	}
	public static void displayArray(int[][] array5){
		System.out.println("******Swapped Array******");
		for(int i=0; i<array5.length;i++){
			for(int j=0; j<array5[0].length;j++){
				System.out.print(array5[i][j]+" ");
			}
			System.out.println();
		}
	}
}