package Programs;

 interface Animal {
	  public void noise();

}

 class Cat implements Animal{

	@Override
	public void noise() {
		System.out.println("meww meww");

	}

 }

 class Dog implements Animal{

	@Override
	public void noise() {
		System.out.println("Boww Boww");

	}

 }
 class Snake implements Animal{

	@Override
	public void noise() {
		System.out.println("Buss Buss");

	}

 }

 class Stimulator{
	 static  void ansim(Animal a) {
		 a.noise();
	 }
 }

   class Animal1{
	 public static void main(String[] args) {
		Cat c1=new Cat();
		Dog d1=new Dog();
		Snake s1=new Snake();
		Stimulator.ansim(c1);
		Stimulator.ansim(d1);
		Stimulator.ansim(s1);



	}
 }
