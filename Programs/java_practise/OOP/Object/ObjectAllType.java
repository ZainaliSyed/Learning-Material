class ObjectAllType{
	int fisrt;
	int second;
	float fst;
	float sec;
	double doubleFst;
	double doubleSec;
	String s="";
	char ch='0';
	
	void add(int a, int b){
		fisrt=a;
		second=b;
		System.out.println("Addition Result is :"+(fisrt+sec));
	}
	
	void addFloat(float a, float b){
		fst=a;
		sec=b;
		System.out.println("Float Addition Result is :"+(fst+sec));
	}
	
	void addDouble(double a, double b){
		doubleFst=a;
		doubleSec=b;
		System.out.println("Double Addition is : "+(doubleFst+doubleSec));
	}
	int add(){
		fisrt=100;
		second=100;
		return (fisrt+second);
	}
	
	void sub(){
		System.out.println("Subtraction : "+(fisrt-second));
	}
	
	void sub(double a, double b){
		doubleFst=a;
		doubleSec=b;
		System.out.println("Subtraction Double Result is  : "+(doubleFst-doubleSec));
	}
	
	double subReturn(){
		return doubleFst-doubleSec;
	}

	void Student(String name){
		s=name;
		System.out.println(s);
	}
	
	String StudentReturn(String name){
		s=name;
		return s;
	}
	void character(char c){
		ch=c;
		System.out.println("The Character is  : "+ch);
	}
	char character(){
		return ch;
	}
}