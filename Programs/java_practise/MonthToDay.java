import java.util.*;
class MonthToDay{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.println("please enter month :");
float month=ob.nextInt();
float day=month*30;  
System.out.println("days are : "+day);
}
}