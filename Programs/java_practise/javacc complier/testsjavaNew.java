public class testsjavaNew{
public static void main(String args[]){
     Token t;
      TokenManager tm;
	  //sjavaNew
	 //<" ">
	 //TokenManager tm = new TokenManager();
	try{

		java.io.FileInputStream infile = new java.io.FileInputStream("input.txt");
		tm = new sjavaTokenManager ( new SimpleCharStream(infile) );
	}
	catch(java.io.FileNotFoundException e) {System.out.println("file not found"); 
	return;}

	t = tm.getNextToken();
	while (t.kind != sjavaConstants.EOF){
	System.out.println("processed token is: " +t);
	t = tm.getNextToken();
	}


   }//end of main 

}