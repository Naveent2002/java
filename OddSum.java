import java.util.Scanner;
class OddSum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int sum = 0, count = 0;
		for(int i = 1;count<input;i++){
			if(i%2 == 1){
				count++;
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println(input*input);
	}
}