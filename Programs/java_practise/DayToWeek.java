import java.util.*;
class DayToWeek{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.print("please enter the days :");
int days=ob.nextInt();
int year=days/365;
System.out.println("year are :"+year);

int yearrem=days%365;
int week=yearrem/7;
System.out.println("weeks are :"+week);

int remDay=days%7;

//int forDay=remDay-1;
//int day=forDay/7;
System.out.print("days are :"+forDay);


}

}