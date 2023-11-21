import java.util.Arrays;
class Sorts{
public static void main(String args[]){
//deepEqals:
int t1[][] = {{1,2},{3,4}};
int t2[][] = {{1,2},{3,4}};
System.out.println(Arrays.equals(t1,t2));
System.out.println(Arrays.deepEquals(t1,t2));


//spilt Data:
String data = "Nayanthara,Trisha,Samantha";
String name[] = data.split(",");
System.out.println(data);
System.out.println(Arrays.toString(name));


//copyOf:
int val[]= {5,6,7,3,8,2,1};
int val2[]= {5,6,7,3,8,2,1};
//int val3[]=Arrays.copyOf(val2,5);
//System.out.println(Arrays.equals(val,val2));


//for each:
//for(int i:val){
//System.out.println(i);
//}
//System.out.println();


//binary search:
int find = 10;
int result =Arrays.binarySearch(val,find);
System.out.println(result);
}}
