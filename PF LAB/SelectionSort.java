public class SelectionSort{
	public static void main(String[] args) {
		int[] array ={56,7,62,67,89,67,35,42,76,45,6,5};
		int min,temp=0;
		for(int i=0; i<array.length;i++){
			min=i;
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[min]){
					min=j;
				}
			}
			temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		} 
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}