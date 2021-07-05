package org.java.main;

/**
 * Created by Koshkin Illia on 04.07.2021.
 */
public class Contact {
	
	private String lastName;
	private String firstName;
	private String patronymic;
	
	private String nickname;
	private String comment;
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getPatronymic() {
		return patronymic;
	}
	
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String shortToString() {
		return lastName + " " + firstName.substring(0, 1) + ".";
	}
	
	
}
