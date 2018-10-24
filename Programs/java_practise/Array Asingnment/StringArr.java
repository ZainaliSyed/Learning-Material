import java.util.*;
 class StringArr{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		String arr [] = {"santosh","zain","salman","ali","faris"};
		
		for(int i=0; i<4; i++){
			
			for(int j=0; j<arr.length-1; j++){
			int  code = arr[i].compareTo(arr[i+1]);
				if(code>0){
					int tem=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=tem;
				}
			}
		}//end of for
		
			for(int k=0;k<arr.length; k++){
				System.out.println(arr[k]);
			}
		

		
	}
 }