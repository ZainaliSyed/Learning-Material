import java.util.*;
class TrollyLoad{
	public static void main(String args[]){
Scanner ob = new Scanner(System.in);
System.out.print("please enter no of Trolly :");
int trolly = ob.nextInt();

System.out.print("please enter the amount per Trolly : ");
int amount=ob.nextInt();

int  total =trolly*amount;
System.out.println("Total amount of Trolly :"+total); 

System.out.println("");
System.out.println("");

int maintaince=(total/100)*3;
System.out.println("Maintainve 3% :"+maintaince);

int driver =(total/100)*10;
System.out.println("Driver 10% :"+driver);

int tolltax=(total/100)*5;
System.out.println("Toll tax  :"+tolltax);

int desiel =(total/100)*50;
System.out.println("Desiel :"+desiel);

int profit=total-maintaince-driver-tolltax-desiel;
System.out.println("your  profit is  : "+profit);



    }
}