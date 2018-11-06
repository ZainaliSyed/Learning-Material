import java.util.*;
class SecToDay{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.println("please enter the second :");
float sec=ob.nextInt();
float day=(sec/3600)*24;
System.out.println("days are :"+day);

}
}