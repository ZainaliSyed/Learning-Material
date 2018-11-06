import java.util.*;
class SecToHourR{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.println("please enter the second :");
int sec=ob.nextInt();
int hour=sec/3600;
int remhour=hour%60;
System.out.print("the hour are :"+remhour);

}
}