import java.util.Scanner;
class NumPalindromTask13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int duplicate = number, reverseNum = 0;
		while(duplicate > 0){
			reverseNum *= 10;
			if(duplicate % 10 == 0){
				reverseNum *= 10;
			}
			else{
				reverseNum += duplicate % 10;
			}
			duplicate /= 10;
		}
		System.out.println(reverseNum==number);
	}
}