import java.util.*;
class ArrayMarksheet{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		int arr[] = new int[5];
			int total =500;
			int obtain =0;
			float percent=0;
		for(int i=0; i<5; i++){
			
			if(i==0){
				System.out.print("Enter Java Marks : ");
				arr[i]=ob.nextInt();
			}
			if(i==1){
				System.out.print("Enter c++ Marks : ");
				arr[i]=ob.nextInt();
			}
			if(i==2){
				System.out.print("Enter Ic Marks : ");
				arr[i]=ob.nextInt();
			}
			if(i==3){
				System.out.print("Enter Math Marks : ");
				arr[i]=ob.nextInt();
			}
			if(i==4){
				System.out.print("Enter English Marks : ");
				arr[i]=ob.nextInt();
			}
			
			obtain=arr[i]+obtain;
			percent =(obtain*100)/500f;
			
			
		}//end of for	
			
			String grade="";
				
			if(percent<50){
				grade="Sorry you are fail .. ! ";
			}
			else if(percent>50 && percent<=60){
				grade =" D";
			}
			
			else if(percent>60 && percent<=70){
				grade =" C";
			}
			else if(percent>70 && percent<=80){
				grade =" B";
			}
			else if(percent>80 && percent<=90){
				grade =" A";
			}
			else if(percent>90 && percent<=100){
				grade =" A-1 ";
			}
			
			System.out.println("\nObtain Marks : "+obtain);
			System.out.println("Total Marks :  "+total);
			System.out.println("Percentage :  "+percent+" %");	
			System.out.println("Grade : "+grade);	
		
	}//end of main
}