public class SumUsingRecursion{
	public static void main(String[] args) {
		int result = sumOfNumbers(10);
		System.out.print(result);
	}
	public static int sumOfNumbers(int number){
		if(number==0){
			return 0;
		}
		return number+sumOfNumbers(number-1);
    }
}