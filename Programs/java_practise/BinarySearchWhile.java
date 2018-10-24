import java.util.*;
	public class BinarySearchWhile {
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	int [] arr = {2,5,39,40,45,55,80,88,98};
	int begin = 0 ,last = arr.length-1;//8
	
	
	System.out.print("Please Enter Your No : ");
	int no = ob.nextInt();
	
	int mid =begin+last/2;
	

	while(begin!=last &&(arr[mid]!=no)){
		if(arr[mid]>no){// less then 45
			last = mid -1;
		}
			else if(arr[mid]<no){
				begin =mid -1;
			}
	
		mid = begin+last/2;
	}
	
	
	if(begin<=last){
	System.out.println("The Item has Found ...."+(mid));
	}
	else {
	System.out.println("The Item has not  Found ....");
	}
	 
	
	}
	}
	
	
	
	/* if(arr[mid]==no){
	 loc = mid;
	 System.out.println("The Item has Found ....");
	 }
	 else{
	 loc = null;
	 System.out.println("The Item has not  Found ....");
	 } */
	