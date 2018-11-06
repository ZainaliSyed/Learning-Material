import java.io.*;
import java.util.*;
class Filing  {
public static void main(String args[]){
try{
 //String s= JOptionPane.showInputDialog("");
//File f  = new File()


FileInputStream santosh = new FileInputStream("C:\\Users\\Hp EliteBook 6930p\\Desktop\\Puzzle.java");
FileOutputStream fout = new FileOutputStream("D:\\Santosh_Puzzle.java");
PrintStream pr = new PrintStream(fout);
Scanner obj = new Scanner(santosh);

System.out.println("Reading File From Puzzle.java");
while(obj.hasNextLine()){
String s = obj.nextLine();
System.out.println(s);
pr.println(s);
}
System.out.println("Done Reading  Puzzle.java");


}catch(Exception ex){
System.out.println("File Does not Exists here  ........... !!!!!!!!!   ");
}


}
}