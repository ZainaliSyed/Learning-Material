import java.util.*;
class DigitNo{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);

System.out.print("please enter the digits :");
int number=ob.nextInt();

int digit1=number/1000;
System.out.print("the digits are :"+digit1);

int remdigit=number%1000;
int digit2=remdigit/1000;
System.out.print(","+digit2);
}

}