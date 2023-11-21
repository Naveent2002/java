import java.util.Scanner;
class Fibonacci{
public static void main(String areg[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the Number:");
int n = scan.nextInt();
int a=-1,b=1,c;
for(int i=0;i<=n;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}