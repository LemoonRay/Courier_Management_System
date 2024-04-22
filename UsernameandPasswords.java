import java.util.HashMap;

public class UsernameandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	UsernameandPasswords(){
		
		logininfo.put("I miss", "my ex");
		
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
