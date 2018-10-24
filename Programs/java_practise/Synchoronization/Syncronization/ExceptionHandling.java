import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ExceptionHandling {
    Scanner ob=new Scanner(System.in);
    public ExceptionHandling() {
        try{
        deviison();
        }catch(Exception ex){
            System.out.println("sory ap ne jo input dya tha vo glt tha plz try again");
            try {
                //ex.printStackTrace();
               deviison();
            } catch (Exception ex1) {
                
            }
        }
    }
    
    public static void main(String arg[]){
        ExceptionHandling ob=new ExceptionHandling();
    }

    private void deviison()throws Exception{
        System.out.println("Enter 1 value:");
        int num1=ob.nextInt();
        System.out.println("Enter 2 value:");
        int num2=ob.nextInt();
        
            System.out.println("divion is="+(num1/num2));
        
    }
}
