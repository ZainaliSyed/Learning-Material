// ATM MACHINE ENTER RUPES AND GET NOTE DISTRIBUTION ....


import java.util.*; 
class AtmMachine{
public static void main(String args[]){
Scanner ob=new Scanner(System.in);
System.out.print("please enter the rupes  :");
int rupes=ob.nextInt();

System.out.println("");
System.out.println("");

int fiveThousand=rupes/5000;
System.out.println("5000 : "+fiveThousand);

int remfiveThousand=rupes%5000;
int oneThousand=remfiveThousand/1000;
System.out.println("1000 : "+oneThousand);

int remThousand=remfiveThousand%1000;
int fivehundred=remThousand/500;
System.out.println("500 :"+fivehundred);

int remFivehundred=remThousand%500;
int oneHundred=remFivehundred/100;
System.out.println("100 : "+oneHundred); 

int remOneHundred=remFivehundred%100;
int fifty=remOneHundred/50;
System.out.println("50 : "+fifty);

int remfifty=remOneHundred%50;
int twenty=remfifty/20;
System.out.println("20 :"+twenty);

int remtwenty=remfifty%20;
int ten=remtwenty/10;
System.out.println("10 :"+ten);

int remten=remtwenty%10;
int five=remten/5;
System.out.println("5 :"+five);

int remfive=remten%5;
int two=remfive/2;
System.out.println("2 :"+two);


int remTwo=remfive%1;
int one=remTwo/1;
System.out.println("1 :"+one);


}
}