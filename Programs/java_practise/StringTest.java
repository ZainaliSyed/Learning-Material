public class StringTest {
public static void main(String[] args) {
int i = 4;
int j = 5;
System.out.println("Hello" + i); // will print Hello4
System.out.println(i + j); // will print 9
String s1 = new String ("pakistan");
String s2 = "pakistan";
if (s1 == s2) {
System.out.println("comparing string using == operator");
}
if (s1.equals( s2) ) {
System.out.println("comparing string using equal method");
}
}
}