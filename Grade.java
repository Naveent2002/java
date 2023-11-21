import java.util.Scanner;
class Grade{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("Enter Mark-1:");
int mark1=scan.nextInt();
System.out.print("Enter Mark-2:");
int mark2=scan.nextInt();
System.out.print("Enter Mark-3:");
int mark3=scan.nextInt();
int total=mark1+mark2+mark3;
System.out.println("Total:" +total);
int percentage=(int)(((float)total/300)*100);
float per=(total/300)*100;
System.out.println("Percentage:" +percentage);

if(percentage>=80 && percentage<=100)
{
System.out.println("Grade:A");
}
else if(percentage>=60 && percentage<80)
{
System.out.println("Grade:B");
}
else if(percentage>=40 && percentage<60)
{
System.out.println("Grade:C");
}
else
{
System.out.println("Fail");
}
}
}