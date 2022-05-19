public class ReverseArrayUsingRecursion{
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int j=0;
		arrayReverse(array,j);
	}
	public static void arrayReverse(int[] array1,int i){
		if(i==array1.length){
		}
		else{
			System.out.print(array1[array1.length-1-i]);
			i+=1;
			arrayReverse(array1,i);
		}
	}
}