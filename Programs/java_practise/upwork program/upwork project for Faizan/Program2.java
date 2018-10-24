import java.util.*;
public class Program2{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		System.out.println(" Enter Number :  ");
		
		int fsec,d,h,m,s,temp=0,i;
        fsec=150;
        //For Hours
        if(fsec>=3600){
            temp=fsec/3600;
            h=temp;
            for(i=1;i<=temp;i++)
            {
                fsec-=3600;
            }            
        }
			else{
				h=0;
			}
        //For Minutes
        if(fsec>=60){
            temp=fsec/60;
            m=temp;
            for(i=1;i<=temp;i++)
            {
                fsec-=60;
            }            
        }
			else{
				m=0;
			}
        //For Seconds
        if(fsec>=1){
            s=fsec;            
        }
			else{
				s=0;
			}
        System.out.println("Hours:"+h+" Minutes:"+m+" Seconds:"+s);
		
		
		
	}//end of main
}