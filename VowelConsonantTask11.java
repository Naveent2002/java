import java.util.Scanner;
class VowelConsonantTask11{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String charInput = sc.nextLine();
		int vowel = 0,consonant = 0;
		for(int i = 0;i<charInput.length(); i++){
			if(charInput.charAt(i) == 'a' || charInput.charAt(i) == 'e' || charInput.charAt(i) == 'i' || charInput.charAt(i) == 'o' || charInput.charAt(i) == 'u' || charInput.charAt(i) == 'A' || charInput.charAt(i) == 'E' || charInput.charAt(i) == 'O' || charInput.charAt(i) == 'U' || charInput.charAt(i) == 'I'){
				vowel++;
			}
			else{
				consonant++;
			}
		}
			System.out.println("Vowel count: " + vowel);
			System.out.println("Consonant count: " + consonant);
	}
}