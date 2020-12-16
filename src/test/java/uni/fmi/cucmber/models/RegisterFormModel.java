package uni.fmi.cucmber.models;

import uni.fmi.cucmber.services.RegisterService;

public class RegisterFormModel {

	private String username;
	private String pass1;
	private String pass2;
	private String email;
	private String message;

	public void navigateToMe() {
		
	}

	public void setUsername(String username) {
		this.username=username;
	}

	public void setPass1(String pass1) {
		this.pass1=pass1;
	}

	public void setPass2(String pass2) {
		this.pass2=pass2;
	}

	public void setEmail(String email) {
		this.email=email;
	}

	public void register() {
		message = RegisterService.register(username, pass1, pass2, email);
		
	}

	public Object getMessage() {
		return message;
	}

}
