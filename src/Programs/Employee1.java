package Programs;

import java.util.ArrayList;
import java.util.List;

class Laptops {
	private String name;
	private String color;
	private String version;
	


 
 Laptops(String name,String color,String version){
	 this.name=name;
	 this.color=color;
	 this.version=version;
 }




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public String getColor() {
	return color;
}




public void setColor(String color) {
	this.color = color;
}




public String getVersion() {
	return version;
}




public void setVersion(String version) {
	this.version = version;
}
 
 
 
 
public String toString() {
	return "name:"+this.name+" color:"+this.color+" version:"+this.version;
	
}

 }
 public class Employee1{
	 public static void main(String[] args) {
		List<Laptops>laptops=new ArrayList<>();
		laptops.add(new Laptops("Dell","Grey","I5"));
		laptops.add(new Laptops("HP","white","I4"));
		laptops.add(new Laptops("Asus Vivobbok","Grey","I5"));
		System.out.println("Laptop Details of Employee="+""+laptops.get(0));
		System.out.println("Laptop Details of Employee="+""+laptops.get(1));
		System.out.println("Laptop Details of Employee="+""+laptops.get(2));
		
	}
	 
 }
 
 
 
 
