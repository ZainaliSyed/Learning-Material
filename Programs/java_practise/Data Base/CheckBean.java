class CheckBean{
	public static void main(String args[]){
		TestBean bean1 = new TestBean();
		TestBean bean2 = new TestBean();
		
		bean1.setId(5);
		bean1.setName("Zain");
		
		System.out.println(bean1.getId());
		System.out.println(bean1.getName());
		
	}
}