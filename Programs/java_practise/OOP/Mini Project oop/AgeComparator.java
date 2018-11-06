import java.util.*;
class AgeComparator{
	Scanner ob = new Scanner(System.in);
	void age(){
				
					System.out.println("************ AGE COMPARATOR *********** \n ");
					
					System.out.print("Enter 1st Age : ");
					int age1= ob.nextInt();
					
					System.out.print("Enter 2nd Age : ");
					int age2= ob.nextInt();
					
					System.out.print("Enter 3rd Age : ");
					int age3= ob.nextInt();

						if(age1<age2){
							System.out.println("Age 2 is Greater . "+age2);
						}
						
						else if(age2<age3){
							System.out.println("Age 3 is Greater . "+age3);
						}
						
						else if(age1<age3){
							System.out.println("Age 3 is Greater . "+age3);
						}
	}
}