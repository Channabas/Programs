package Programs;

import java.util.HashMap;
import java.util.Map;

class User {
	private String MobileNumber;
	private String name;
	private String nickname;
	
	User(String MobileNumber,String name,String nickname){
		this.MobileNumber=MobileNumber;
		this.name=name;
		this.nickname=nickname;
		
	}

	public String  getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String MobileNumber) {
		this.MobileNumber=MobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String toString() {
		return this.MobileNumber+" "+this.name+" "+this.nickname;
	}
}

class Main{
	public static void main(String[] args) {
		Map<String, User>user=new HashMap<>();
		user.put("8495860727",new User("8495860727","Channa","Basya"));
		String searchMobileNumber="8495860727";
		if(user.containsKey(searchMobileNumber)){
			User u1=user.get("8495860727");
			System.out.println("Details for mobile number "+searchMobileNumber+":"+u1);
			
			
		}
		else {
			System.out.println("No details found for mobile Number "+searchMobileNumber);
		}
		
		
		
		
		
	}
}
