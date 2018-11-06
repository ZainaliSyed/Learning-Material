class Demo{
	int first;
	int second;
	String s="";
	
	void init(int a, int b){
		first=a;
		second=b;
		
	}
	
	void add(){
		System.out.println("Addition is = "+(first+second));
	}
	
	void sub(){
		System.out.println("Subtraction is = "+(first-second));
	}
	
	void display(){
		System.out.println("First "+first);
		System.out.println("Second "+second);
	}
	int multy(){
		return first*second;
	}
	
	void sentence(String name){
		s=name;
		System.out.println(s);
		
	}
	String sen(){
		return s;
	}
	
}