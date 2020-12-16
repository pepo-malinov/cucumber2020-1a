package uni.fmi.cucmber.models;

import java.util.*;

/**
 * 
 */
public class User {



	/**
	 * 
	 */
	private String username;

	/**
	 * 
	 */
	private String password;

	/**
	 * 
	 */
	private String email;

	/**
	 * 
	 */
	private String address;

	/**
	 * 
	 */
	public Set<Order> orders;

	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}

	/**
	 * Default constructor
	 */
	public User() {
	}

	/**
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 * @return
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param pass
	 * @return
	 */
	public void setPassword(String pass) {
		this.password = pass;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 * @return
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}