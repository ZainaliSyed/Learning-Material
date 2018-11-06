import java.util.*;
class RecDemo
{
	Scanner s=new Scanner(System.in);
	int num;
	int i=1;
	RecDemo()
	{
		System.out.print("Enter Range");
		num=s.nextInt();
		startMe();
		System.out.println("Exit");
	}
	public static void main(String args[])
	{
		RecDemo ob=new RecDemo();
	}//end of main
	
	void startMe(){
		System.out.println(i);
		i++;
		if(i>=num){
			return;
		}
		startMe();
		
	}//end of methid 
}