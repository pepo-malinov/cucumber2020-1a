package uni.fmi.cucmber.services;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.cucmber.models.User;

public class LoginService {
	private static List<User> users = new ArrayList<>();

	public static String login(String username, String password) {

		if (null == password || password.isEmpty()) {
			return "Въведете парола!";
		}

		if (null == username || username.isEmpty()) {
			return "Въведете потребителско име!";
		}

		boolean isExists = getUsers().stream()
				.anyMatch(user -> user.getUsername().equals(username) && user.getPassword().equals(password));

		return isExists ? "Успешно влизане в системата!" : "Потребителските данни не са валидни!";
	}

	public static List<User> getUsers() {
		if (users.isEmpty()) {
			users.add(new User("Ivan", "password", "test@email.com"));
		}
		return users;
	}

}
