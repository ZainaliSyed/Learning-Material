import java.util.*;
class MinToYear{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.println("please enter the minute :");
float min=ob.nextInt();
float month=min/525600;
System.out.println("month are :"+month);
}
}