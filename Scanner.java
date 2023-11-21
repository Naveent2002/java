import java.util.Scanner;
class Scannerexample{
public static void main(String[] arg){
int age; 
Sysytem.out.println("enter your age:");
Scanner in=new Scanner(System.in);
age=in.nextInt();
if(age>=18)
{
System.out.println("you are eligible for vote");
}
}
}