import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class LoginPage implements ActionListener {

	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField usernameField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel usernameLabel = new JLabel("Username:");
	JLabel userPasswordLabel = new JLabel("password:");
	JLabel messageLabel = new JLabel();
	
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> loginInfoOriginal){
		logininfo = loginInfoOriginal;
		
		usernameLabel.setBounds(50, 100, 75, 25);
		userPasswordLabel.setBounds(50, 150, 75, 25);
		
		messageLabel.setBounds(125, 250, 250, 35);
		messageLabel.setFont(new Font(null,Font.ITALIC, 25));
		
		usernameField.setBounds(125, 100, 200, 25);
		userPasswordField.setBounds(125, 150, 200, 25);
		
		loginButton.setBounds(125, 200, 100, 25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225, 200, 100, 25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(usernameField);
		frame.add(userPasswordField);
		frame.add(usernameLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==resetButton) {
			usernameField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource()==loginButton){
			
			String username = usernameField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(username)) {
				if(logininfo.get(username).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login Successful");
					frame.dispose();
					WelcomePage welcomePage = new WelcomePage(username);
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong username or password");
				}
			}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong username or password");
				}
			}
		}
	}
	

