class Test{
	public static void main(String args[]){
		
		Demo ob1 =new Demo();
		Demo ob2 = new Demo();
		
		ob1.init(5,10);
		ob2.init(10,5);
		
		ob1.add();
		ob1.sub();
		ob1.display();
		int mul = ob1.multy();
		System.out.println(ob1.multy());
		System.out.println("Return Value : "+mul);
		ob1.sentence("zain");
		System.out.println(ob1.sen());	
		
		System.out.println("");
		
		ob2.add();
		ob2.sub();
		ob2.display();
		System.out.println(ob2.multy());
		ob2.sentence("Santosh");
		System.out.println(ob2.sen());
		
		
	}
}