import java.util.*;
class PrimeNo{
public static void main(String args[]){
Scanner ob= new Scanner(System.in);
int primeno,i;

System.out.print("please enter a number :");
primeno=ob.nextInt();

	for(i=2; i<=primeno/2; i++){ 
        if(primeno%i==0){
			System.out.println("the number  is not prime ");
			return;
		}

    }//end of for
		System.out.println("the no is prime no ");
	}
}