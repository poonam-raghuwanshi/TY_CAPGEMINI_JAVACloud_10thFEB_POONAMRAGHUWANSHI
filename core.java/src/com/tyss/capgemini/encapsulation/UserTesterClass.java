package com.tyss.capgemini.encapsulation;

public class UserTesterClass {

	private static User setUser(String username, String password, Integer usedid) {
		return new User(username, password, usedid);

	}

	public static void main(String[] args) {
		User user1 = new User("Mike", "quirty", 202020);
		User user2 = new User();

		user2.setUsername("toby");
		user2.setPassword("12344");
		user2.setUsedId(2020200);

		System.out.println("UserName: " + user1.getUsername());
		System.out.println("UserId: " + user1.getUsedId());

		System.out.println(user2);
	}

}
