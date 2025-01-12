package Programs;

public class RemoveDuplicates2 {
	public static void main(String[] args) {
		String str="Hello";
		char[]ch=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ch.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				sb.append(ch[i]);
			}
			
			
			
		}
		System.out.println(sb);
		
	}

}
