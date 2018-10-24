import java.util.*;
	class StringNum{
		public static void main(String args[]){
			String arr [] ={"50","90","05","99","100","7000","2","1"};
			//String temp =arr[0];
			for(int k=0; k<arr.length-1; k++){
				for(int i=0; i<arr.length-(k+1); i++){
					
					int code = arr[i].compareTo(arr[i+1]);
					if(code>0){
						String temp =arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
					}
				}
			}
			for(int j=0; j<arr.length; j++){
				System.out.println(arr[j]);
			}
		}//end main method
	}//end class