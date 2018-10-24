import java.util.*;
	public class BinarySearch {
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	int [] arr = {2,5,39,40,45,55,80,88,98};
	int begin = 0 ,last = arr.length-1;//8
	
	System.out.print("Please Enter Your No : ");
	int no = ob.nextInt();
	
	int mid = begin+last/2;
	
		if(arr[mid]==no){
		System.out.println(" Number has Found .."+mid);
	
		}
	
		else if(arr[mid]<no){ // The greater then 45
		
		mid =begin+mid/2;{
		System.out.println("The Number has Found : "+mid);
		
		}
		
		begin = mid-1;
		if(begin==5){
		System.out.println("The Number has Found : "+begin);
		}
		
		begin = mid +1;
		if(begin==7){
		System.out.println("The Number has Found : "+begin);
		}
		
			
		}
		
		else if(arr[mid]>no){
		
		mid =begin+mid/2;
		System.out.println("The Number has Found : "+mid);
		
			
		
		last = mid-1;
		if(last==1){
		System.out.println("The Number has Found : "+last);
		}
		
		last = mid +1;
		if(last==3){
		System.out.println("The Number has Found : "+last);
		}
		
		
		}
		
		else {
		System.out.println("The number not found ...!!!!");
		}

	
	/*while(begin!=last){
	mid =begin+last/2;
	}
	if(begin<=last){
	System.out.print("Item Found :" );
	}
	*/
	
	}
	}