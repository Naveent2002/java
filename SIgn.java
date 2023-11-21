import java.util.Scanner;
class Sign{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input > 0)
			System.out.println("Positive Number");
		else if(input < 0)
			System.out.println("Negative Number");
		else
			System.out.println("Zero");
	}
}