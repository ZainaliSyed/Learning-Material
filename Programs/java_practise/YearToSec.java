import java.util.*;
class YearToSec{
public static void  main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.println("please enter the year :");
double year=ob.nextInt();
double sec=year*315360000;
System.out.println("seconds are :"+sec);
}
}