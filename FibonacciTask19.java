import java.util.Scanner;
class FibonacciTask19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit: ");
		int limit = sc.nextInt();
		int x = -1, y = 1,z;
		for(int i=0;i<limit;i++){
			z = x+y;
			x = y;
			y = z;
			System.out.println(z);
		}
	}
}