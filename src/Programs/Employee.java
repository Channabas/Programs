package Programs;

import java.util.ArrayList;
import java.util.List;

class Laptop {
	 private String name;
	 private String color;
	 private String version;
	 
	 Laptop( String name,String color,String version){
		 this.name=name;
		 this.color=color;
		 this.version=version;
	 }

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name =name;
	}

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}
	
	
	
	public String getversion() {
		return version;
	}
	public String toString() {
		return this.name+" "+this.color+" "+this.version;
	}
	
	public static void main(String[] args) {
		
		List<Laptop>l=new ArrayList<>();
		Laptop laptop=new Laptop("DELL","color","I5");
		l.add(laptop);
		if(l.isEmpty()) {
			System.out.println("no laptops found");
		}
		else {
			System.out.println(l);
		}
		
		
		
	}
	

}
