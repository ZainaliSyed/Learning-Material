import java.util.*;
	class ConvertBinary{
		public static void main(String args[]){
			Scanner ob =new Scanner(System.in);
			
		int arr[] = new int [10];
		int i=0;
			System.out.print("Enter Item you Like : ");
			int no = ob.nextInt();
			
			int counter =0;
				while (no > 0) {
					arr[i++] = no % 2;
					no =no/ 2;
				}//end of while loop
			
			 int binary [] = new int[i];
			int k=0;
			for (int j = i - 1; j >= 0; j--) {
				binary[k++] = arr[j];
			}	
			
			for(int a=0; a<binary.length; a++){
				System.out.println("  [ ] "+binary[a]);
			}
			
		}
	}