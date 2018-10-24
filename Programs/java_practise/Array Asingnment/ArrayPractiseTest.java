import java.util.*;
class ArrayPractiseTest{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		int arr [] = new int[10];
		for(int i=0; i<arr.length; i++){
			System.out.print(" Enter ["+i+"] = ");
			arr[i] = ob.nextInt();
		}
		
		for(int j=0; j<arr.length; j++){
			System.out.println(j+" ) "+arr[j]);
		}
	}
}