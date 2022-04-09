public class InsertionSort{
	public static void main(String[] args) {
		int[] array = {14,17,68,45,67,89,90,34};
		int temp,j;
		for(int i=1oolean;i<array.length;i++){
			temp=array[i];
			j=i;
			while(j>0 && array[j-1]>temp){
				array[j]=array[j-1];
				j--;
			}
			array[j]=temp;
		}
		for(int k=0;k<array.length;k++){
			System.out.print(array[k]+" ");
		}
	}
}