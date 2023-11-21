import java.util.Scanner;
class SwapTask5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int firstInput = sc.nextInt();
		int secondInput = sc.nextInt();
		firstInput = firstInput + secondInput;
		secondInput = firstInput - secondInput;
		firstInput = firstInput - secondInput;
		System.out.println(firstInput);
		System.out.println(secondInput);
	}
}