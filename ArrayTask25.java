import java.util.Arrays;
class ArrayTask25{
	public static void main(String args[]){
		int arr[] = {1,3,3,5,7,8,2,4,5,6,7,8};
		Arrays.sort(arr);
		for(int i = 0;i<arr.length;i++){
			if(i<arr.length-1){
				if(arr[i] != arr[i+1]){
					System.out.print(arr[i] + " ");
				}
				else{
					i++;
				}
			}
		}
	}
}