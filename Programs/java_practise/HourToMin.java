import java.util.*;
class HourToMin{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.println("please enter the hour :");
float hour=ob.nextInt();
float min=hour*60;
System.out.println("minutes are :"+min);
}
}