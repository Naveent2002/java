import java.util.Scanner;
class AverageCalculator{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter five numbers:");
        double num1=scanner.nextInt();
        double num2=scanner.nextInt();
        double num3=scanner.nextInt();
        double num4=scanner.nextInt();
        double num5=scanner.nextInt();
        int num6=scanner.close();
        double average=(num1+num2+num3+num4+num5)/5;
        System.out.println("The average of the numbers is:"+average);
    }
}
