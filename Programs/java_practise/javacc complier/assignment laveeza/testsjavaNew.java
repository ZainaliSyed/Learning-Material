import java.io.*;
public class testsjavaNew{
public static void main(String args[]){
	Token t;
    try{
		
		FileInputStream infile = new FileInputStream("input.txt");
		sjavaNewTokenManager tm = new sjavaNewTokenManager ( new SimpleCharStream(infile) );
		
		t = tm.getNextToken();
		while (t.kind != sjavaNewConstants.EOF){
			System.out.println("processed token is: " +t);
			t = tm.getNextToken();
		}

	}catch(Exception e) {System.out.println("file not found"+e.getMessage()); 
	}
	//return;}
	catch(TokenMgrError ee){
    System.out.println (ee.getMessage());
    }

	

   }//end of main 

}