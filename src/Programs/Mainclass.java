package Programs;

 class Whatsapp_v1 {
	 void status() {
		 System.out.print("status with images");
	 }
}

 class Whatsapp_v2 extends Whatsapp_v1{
	 void status() {
		 System.out.print("status with audio and video");
		 super.status();
	 }
 }
 
 public class Mainclass{
	 public static void main(String[] args) {
		Whatsapp_v2 v2=new Whatsapp_v2();
		v2.status();
		
	}
 }