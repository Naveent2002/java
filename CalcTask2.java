import java.util.Scanner;
class CalcTask2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int firstInput = sc.nextInt();
		int secondInput = sc.nextInt();
		System.out.println("Sum : " + (firstInput + secondInput));
		System.out.println("Sub : " + (firstInput - secondInput));
		System.out.println("Mul : " + (firstInput * secondInput));
		System.out.println("Div : " + (firstInput / secondInput));
		System.out.println("Mod : " + (firstInput % secondInput));
	}
}