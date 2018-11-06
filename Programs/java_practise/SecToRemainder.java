import java.util.*;
class SecToRemainder{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.print("please enter the second :");
int sec=ob.nextInt();
int hour=sec/3600;
int remhour=hour%60;
System.out.println("the hour are :"+remhour);


int min=sec/60;
int remsec=min%60;
System.out.println("the minutes are :"+remsec);

int rem=sec%60;
System.out.print("the seconds are :"+rem);
}
}