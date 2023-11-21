import java.util.Scanner;
class Scannerexample{
public static void main(String[] arg){
int age; 
Scanner scan=new Scanner(System.in);
age=scan.nextInt();
if(age>=18)
{
System.out.println("you are eligible for vote");
}
}
}