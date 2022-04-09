public class BubbleSort{
	public static void main(String[] args) {
		String [] array = {"Zohaib","Daoud","Qasim","Ahmed","Waleed","Ahmer","Dog","Doa"};
		String temp;
		for(int i=0; i<array.length ;i++){
			int flag =0;
			for(int j =0; j<array.length-1-i;j++){
				if(array[j].compareTo(array[j+1])>0){
					/*CompareTo() return 0 agr String k letter ki unicode value same ha
					 return -1 agr unicode value choti ha.
					 return 1 agr unicode value bari ha.
					*/

					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0){
				break;
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}