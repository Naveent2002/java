import java.util.Scanner;
class MulTableTask16{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(int i = 1;i<=10;i++){
			System.out.println(i + " x " + input + " = " +(input*i));
		}
	}
}