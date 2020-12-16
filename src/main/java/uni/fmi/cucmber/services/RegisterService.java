package uni.fmi.cucmber.services;

import uni.fmi.cucmber.models.User;

public class RegisterService {

	public static String register(String username, String pass1, String pass2, String email) {

		if (pass1 == null || pass1.length() < 3 || pass1.length() > 16) {
			return "Въведете валидна парола";
		} else if (!pass1.equals(pass2)) {
			return "Въведете еднакви пароли";
		}

		if (username == null || username.length() < 3|| username.length() > 16) {
			return "Въведете валидно име";
		}
		User user = new User(username, pass1, email);
		LoginService.getUsers().add(user);
		return "Успешно се регистрирахте";
	}

}
