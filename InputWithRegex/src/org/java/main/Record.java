package org.java.main;

public class Record {
	
	private String name;
	private String nickname;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "; Nickname: " + nickname + ".";
	}
	
	
}
