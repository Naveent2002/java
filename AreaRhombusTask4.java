import java.util.Scanner;
class AreaRhombusTask4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first diagnoal: ");
		int firstInput = sc.nextInt();
		System.out.print("Enter second diagnoal: ");
		int secondInput = sc.nextInt();
		System.out.println("Area of Rhombus: " + (firstInput*secondInput)/2);
	}
}