package Programs;

public class Encap {
	private int id=2;
	private String name;
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
	
      this.id=id;
}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	
	public static void main(String[] args) {
		Encap e=new Encap();
		System.out.println(e.getid());
		e.setid(4);
		System.out.println(e.getid());
		e.setname("Channa");
		System.out.println(e.getname());
		
	}
}
