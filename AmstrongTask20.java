import java.lang.Math;
class AmstrongTask20{
	public static void main(String args[]){
		for(int i = 1;i<=600;i++){
			int duplicate = i;
			int sum = 0;
			while(duplicate > 0){
				if(i<10){
					sum += Math.pow(duplicate%10,1);
					duplicate /= 10;	
				}
				else if(i>=10 && i<100){
					sum += Math.pow(duplicate%10,2);
					duplicate /= 10;
				}
				else{
					sum += Math.pow(duplicate%10,3);
					duplicate /= 10;
				}
			}
			if(sum == i){
				System.out.println(sum);
			}
		}
	}
}