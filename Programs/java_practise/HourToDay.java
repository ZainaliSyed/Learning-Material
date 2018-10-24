import java.util.*;
class HourToDay{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.println("please enter the minutes :");
float hour=ob.nextInt();
float day=hour/24;
System.out.println("days are :"+day);
}
}