
public class Main {

	public static void main(String[] args)
	{
		UsernameandPasswords usernameandPasswords = new UsernameandPasswords();
		
		LoginPage loginPage = new LoginPage(usernameandPasswords.getLoginInfo());
	}
}
