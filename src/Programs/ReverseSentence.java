package Programs;

public class ReverseSentence {
	public static void main(String[] args) {
		String str="Hii Basava";
		String[] s1=str.split("");
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]+"");
		}
	}

}
