package com.tyss.capgemini.encapsulation;

public class User {
private String username;
private String password;
private Integer usedId; //integer just act as int

public User(String username, String password, Integer usedId) {
	super();
	this.username = username;
	this.password = password;
	this.usedId = usedId;
}

public User() {
	
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Integer getUsedId() {
	return usedId;
}
public void setUsedId(Integer usedId) {
	this.usedId = usedId;
}
@Override
public String toString() {
	return "User [username=" + username + ", password=" + password + ", usedId=" + usedId + "]";
}
 




}
