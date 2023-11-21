import java.util.Scanner;
class VowelConsonant{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char charInput = sc.next().charAt(0);
		if(charInput == 'a' || charInput == 'e' || charInput == 'i' || charInput == 'o' || charInput == 'u' || charInput == 'A' || charInput == 'E' || charInput == 'O' || charInput == 'U' || charInput == 'I'){
			System.out.println("Vowel");
		}
		else{
			System.out.println("Consonant");
		}
	}
}