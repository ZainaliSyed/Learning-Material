import java.util.*;
class BasicPay{
	public static void main(String args[]){
Scanner ob = new Scanner(System.in);
System.out.print("please enter Employee Basic pay :");
int amount = ob.nextInt();

int  houserent=(amount/100)*45;
System.out.println("House Rent 45% :"+houserent);

int medicalAllow=(amount/100)*15;
System.out.println("Medical Allowance 15% : "+medicalAllow);

int bouns =(amount/100)*5;
System.out.println("Bouns 5% :"+bouns);

int grossPay=amount+houserent+medicalAllow+bouns;
System.out.println("your Gross pay :"+grossPay);

// ****** now thing to mines from sallery

int incometax=(amount/100)*5;
System.out.println("Income tax 5% :"+incometax);

int zakat=(amount/100)*3;
System.out.println("Zakat  3% :"+zakat);

int vehicle=(amount/100)*8;
System.out.println("convenice Allowance 8% :"+vehicle);

int netIncome=grossPay-incometax-zakat-vehicle;
System.out.println("your Net Pay :"+netIncome);


	}

}