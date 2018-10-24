import java.util.*;
class Atm{
public static void main(String args[]){
Scanner ob=new Scanner (System.in);
System.out.print("please enter rupes: ");
int rupes=ob.nextInt();
System.out.println("");
System.out.println("");

int fiveThousand=rupes/5000;
int remfive=fiveThousand%5000;
System.out.println("5000 :"+remfive);

//int onethousand=rupes/1000;
int remoneThou=rupes%1000;
int remone=remoneThou/1000;
System.out.println("1000 :"+remone);

//int fivehunderd=rupes/500;
int remfivehun=rupes%500;
int fivehund=remfivehun/500;
System.out.println("500 :"+fivehund);

int onehun=rupes/100;
int remonehun=onehun%100;
System.out.println("100 : "+remonehun);

int fifty=rupes/50;
int remfifty=fifty%50;
System.out.println("50 :"+remfifty);

int two=rupes/2;
int remtwo=two%2;
System.out.println("2 :"+remtwo);

int one=rupes%1;
System.out.print("1 :"+one);

}
}