public class LArgestInArrayRecursion{
	public static void main(String[] args) {
		int[] array = {12,45,3,1,8,56,34,23};
		int firstIndex=0;
		int secondIndex=1;
		largestInArray(array,firstIndex,secondIndex);
	}
	public static void largestInArray(int[] array1,int first,int second){
		if(second== array1.length){
			System.out.print("Largest Element Is : "+array1[array1.length-1]);
		}
		else{
			if(array1[first]>array1[second]){
				int temp = array1[first];
				array1[first]=array1[second];
				array1[second]= temp;
			}
				first=second;
				second+=1;
				largestInArray(array1,first,second);
		}
	}
}