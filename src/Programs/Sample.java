package Programs;

 interface Sample {
	
	 public abstract void disp();
	 public abstract void test();

}
 
 class Demo implements Sample{

	@Override
	public void disp() {
		System.out.println("Hii");
		
	}

	@Override
	public void test() {
		System.out.println("hello");
		
	}
	 
 }
 
  class Example{
	 public static void main(String[] args) {
		Demo d1=new Demo();
		d1.disp();
		d1.test();
}
 }
