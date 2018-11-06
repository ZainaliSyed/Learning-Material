class Polycon{
	
	Polycon(){
		System.out.println(" I am  Empty Constructor ");
		
	}
	
	Polycon(int a){
		System.out.println("I am One Argument");
	}
	
	Polycon(int a, int b){
		System.out.println("I am Two Argument ");
	}
	
	Polycon(double a, int b){
		System.out.println("I am double int Constructor  ");
	}
	
	Polycon(String name, double b){
		System.out.println("I am String double "+name);
	}
	
}