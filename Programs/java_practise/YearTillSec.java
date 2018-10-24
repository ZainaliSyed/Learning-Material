import java.util.*;
class YearTillSec{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.print("please enter the second :");
int sec=ob.nextInt();

int year=sec/315360000;
int remyear=year%365;
System.out.println("year are : "+remyear);

int day=sec/86400;
int remday=day%24;
System.out.println("days are "+remday);

int month=sec/2592000;
int remmonth=month%30;
System.out.println("month are"+remmonth);

int hour=sec/3600;
int remhour=hour%60;
System.out.println("Hour are : "+remhour);

int min=sec/60;
int remmin=min%60;
System.out.println("minutes are :"+remmin);

int rem=sec%60;
System.out.println("second are :"+rem);

}
}