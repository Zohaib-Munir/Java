import java.util.*;
public class Pattren{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number Of Rows : ");
		int rows = input.nextInt();
		System.out.println();
		for(int i=0;i<=rows;i++){
			for(int col =rows;col>=i;col--){
				System.out.print("*");
			}
			for(int sp=0;sp<i;sp++){
				System.out.print(" ");
			}
			for(int str=0;str<i;str++){
				System.out.print(" ");
			}
			for(int n=rows;n>=i;n--){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=0;k<=rows;k++){
			for(int col=0;col<=k;col++){
				System.out.print("*");
			}
			for(int j=rows;j>k;j--){
				System.out.print(" ");
			}
			for(int sp=rows;sp>k;sp--){
				System.out.print(" ");
			}
			for(int sq=0;sq<=k;sq++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}