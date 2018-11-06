import java.util.*;
class SallerySlip{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.print("please enter your salery :");
double gross=ob.nextDouble();

double retirement=gross*(4.0/100);
System.out.println("retirement is :"+retirement);

double medical=gross*(2.5/100);
System.out.println("Medical :"+medical);

double govnTax=gross*(2.0/100);
System.out.println("government tax :"+govnTax);

double policy=gross*(2.2/100);
System.out.println("policy :"+policy);

double houseRent=gross*(3.5/100);
System.out.println("House rent :"+houseRent);

System.out.println("          ************************         ");
System.out.println("");

System.out.println("");

double netSalery=gross-retirement-medical-govnTax-policy-houseRent;
System.out.print("your net salery is :"+netSalery);




}
}