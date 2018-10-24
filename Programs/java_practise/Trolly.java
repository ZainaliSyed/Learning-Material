import java.util.*;
class Trolly{
public static void main(String args[]){
Scanner ob =new Scanner(System.in);

System.out.print("please enter no of load :");
int load = ob.nextInt();

System.out.print("please enter amount of load :");
int amount =ob.nextInt();

int total=amount*load;
System.out.println("Total amount of Trolly :"+total);

System.out.print("please enter current rate of desiel :");
int desielrate =ob.nextInt();

int desiel = 2* load*desielrate;
System.out.println("Desiel expense of Load:"+desiel);

int driverwage =load*150;
System.out.println("Driver wages :"+driverwage);

int tolltax=(total/100)*10;
System.out.println("Toll Tax 10% :"+tolltax);


int profit =total-desiel-driverwage-tolltax;
System.out.println("your Profit is :"+profit);



 }
}