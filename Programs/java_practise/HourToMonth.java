import java.util.*;
class HourToMonth{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.println("please enter the hour:");
float hour=ob.nextInt();
float month=hour/720;
System.out.println("months are :"+month);
}

}