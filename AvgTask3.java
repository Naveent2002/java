import java.util.Scanner;
class AvgTask3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int firstInput = sc.nextInt();
		int secondInput = sc.nextInt();
		int thirdInput = sc.nextInt();
		int fourInput = sc.nextInt();
		int fiveInput = sc.nextInt();
		System.out.println("Avg : " + (firstInput + secondInput + thirdInput + fourInput + fiveInput)/5);
	}
}