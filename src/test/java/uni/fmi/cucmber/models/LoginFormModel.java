package uni.fmi.cucmber.models;

import uni.fmi.cucmber.services.LoginService;

public class LoginFormModel {

	private String username;
	private String password;
	private String message;

	public void navigateToMe() {
		username = null;
		password = null;
		message = null;

	}

	public void setUsername(String username) {
		this.username = username;

	}

	public void setPassword(String password) {
		this.password = password;

	}

	public void login() {
		message = LoginService.login(username, password);

	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
