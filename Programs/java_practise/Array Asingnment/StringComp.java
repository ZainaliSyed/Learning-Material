import java.util.*;
	class StringComp{
		public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
			
			String [] arr ={"100","45","01"};
	        for(int i=0;i<2;i++){
				int code=arr[i].compareTo(arr[i+1]);
				System.out.println(code);
			}
//			System.out.println("'Santosh',Zain,Ali");
			
//			for(int i=0; i<arr.length-1; i++){
//				arr[0].compareTo(arr[1]);
//			}
			
//			for(int j=0; j<arr.length-1; j++){
//				System.out.println(""+arr[j]);
//			}
		}
	}