package Programs;

 interface Animals {
    abstract void noise();
}
 
 class Dog1 implements Animals{

	@Override
	public void noise() {
		System.out.println("bow");
		
	}
 }
	
	class Cat1 implements Animals{

		@Override
		public void noise() {
			System.out.println("mew");
		}
		
	}
	
	class Snake1 implements Animals{

		@Override
		public void noise() {
			System.out.println("buss");
			
		}
		
	}
	
	class Stimulator1{
		static void ansim1(Animals a1) {
			a1.noise();
		}
	}
	
	
	class Polymorphism{
		public static void main(String[] args) {
			Cat1 c1=new Cat1();
			Dog1 d1=new Dog1();
			Snake1 s1=new Snake1();
			
			Stimulator1.ansim1(c1);
			Stimulator1.ansim1(d1);
			Stimulator1.ansim1(s1);
			
		}
	}
	 
 
