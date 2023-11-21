import java.util.Scanner;
import java.lang.Math;
class Prime100Task10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int sum = 2,count = 0;
		for(int i=3;count<99;i++){
			int flag = 0;
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i % j == 0){
					flag = 1;
					break;
				}
			}
			if(flag == 0){
				sum += i;
				count++;
			}
			i++;
		}
		System.out.println(sum);
	}
}