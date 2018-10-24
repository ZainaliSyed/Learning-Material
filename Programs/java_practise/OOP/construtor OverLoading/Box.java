class Box{
	
	int feet;
	int inch;
	int width;
	int height;
	
	Box(){
		System.out.println("Empty Construtor ... ");
	}
	
	Box(int a){
		System.out.println("One Agrment Con .. ");
		feet =a;
	}
	
	Box(int a, int b){
		System.out.println("I am 2 arg Con .. ");
	}
	
	Box(int a, int b, int c){
		System.out.println("3 arg Constructor .. ");
	}
	Box(int a, int b, String c){
		System.out.println("3 + String arg Constructor .. ");
	}
	
	void display(){
		System.out.println("Feet : "+feet+" Inch : "+inch+" Width : "+ width+" Height : "+height);
	}
	
}//end of class 