package Programs;

public class RemoveDuplicates1 {
	public static void main(String[] args) {
		String str="Helloworld";
		
		char[]ch=str.toCharArray();
		StringBuilder sb1=new StringBuilder();
		for(int i=0;i<ch.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j])
				{
					flag=true;
					break;
				}
			}
			if(!flag) {
				sb1.append(ch[i]);
			}
		}
		System.out.println(sb1);
		
		
		
	}

}
