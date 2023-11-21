import java.util.Scanner;
class Time{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int seconds = sc.nextInt();
		int minutes = seconds / 60 ;
		int hour = minutes / 60;
		System.out.println(seconds);
		System.out.println(minutes);
		System.out.println(hour);
	}
}