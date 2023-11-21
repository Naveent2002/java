import java.util.*;
class LengthTask23{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		int count = 0,i=0;
		try{
			while(str.charAt(i) != '\0'){
				count++;
				i++;
			}
		}catch (IndexOutOfBoundsException a){
			System.out.println(count);
		}
	}
}