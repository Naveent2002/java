import java.util.Scanner;
class SimpleCalTask18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number: ");
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulo");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("Sum of two number is: "+(a+b));
				break;
			case 2:
				System.out.println("Difference of two number is: "+(Math.max(a,b)-Math.min(a,b)));
				break;
			case 3:
				System.out.println("Multiplication of two number is: "+(a*b));
				break;
			case 4:
				System.out.println("Quotient of two number is: "+(a/b));
				break;
			case 5:
				System.out.println("Remainder of two number is: "+(a%b));
				break;
			default:
				System.out.println("Invalid choice choose between 1 and 5");
				break;
		}
	}
}