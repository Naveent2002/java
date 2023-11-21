import java.util.Scanner;
class GradeTask21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int eng, tam, mat, sci, soc, tot, grade, percentage;
		System.out.print("Enter the English mark: ");
		eng = sc.nextInt();
		System.out.print("Enter the Tamil mark: ");
		tam = sc.nextInt();
		System.out.print("Enter the Maths mark: ");
		mat = sc.nextInt();
		System.out.print("Enter the Science mark: ");
		sci = sc.nextInt();
		System.out.print("Enter the Social mark: ");
		soc = sc.nextInt();
		tot = eng+tam+mat+sci+soc;
		System.out.println(tot);
		float avg = ((float) tot / 500) * 100;
		System.out.println(String.format("%.2f%%",avg));
		if(((int)avg) < 40){
			System.out.println("Fail");
		}
		else{
			System.out.println("Pass");
		}
	}
}