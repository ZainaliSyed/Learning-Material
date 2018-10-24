// This  program will take the no and print it in inverse order :

import java.util.*;
class InverseNo{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);

System.out.print("please enter the Number :");
int digit=ob.nextInt();

System.out.println("");
System.out.println("");


int number=digit%10;
System.out.print("the digits are :"+number);

int no2=digit/10;
int digit2=no2%10;
System.out.print(","+digit2);

int no3=no2/10;
int digit3=no3%10;
System.out.print(","+digit3);

int no4=no3/10;
int digit4=no4%10;
System.out.print(","+digit4);


}
}