import java.util.*;
class MonthToSec{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.println("please enter month :");
float month=ob.nextInt();
float sec=month*2592000;
System.out.println("seconds are : "+sec);
}
}