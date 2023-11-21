import java.util.Scanner;
import java.lang.Math;
class PrimeTask14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int flag = 0, sqrtOf = (int) Math.sqrt(number);
		for(int i = 2;i<=sqrtOf;i++){
			if(number % i == 0){
				flag = 1;
				System.out.println("Not a Prime Number");
				break;
			}
		}
		if(flag == 0){
			System.out.println("Prime Number");
		}
	}
}