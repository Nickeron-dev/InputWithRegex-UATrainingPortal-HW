package org.java.main;

/**
 * This is the Contact entity that represents a contact.
 * @author Illia Koshkin
 *
 */
public class Contact {
	
	private String lastName;
	private String firstName;
	private String patronymic;
	
	private String nickname;
	private String comment;
	private Groups group;

	private String homePhone;
	private String mobilePhone;
	private String mobilePhone2;
	
	private String email;
	private String skype;
	private String address;
	
	/**
	 * Getter for lastName
	 * @return contact's last name
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Setter for contact's last name
	 * @param lastName which will be set to contact's last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Getter for firstName
	 * @return contact's first name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * Setter for contact's first name
	 * @param firstName which will be set to contact's first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Getter for patronymic
	 * @return contact's patronymic
	 */
	public String getPatronymic() {
		return patronymic;
	}
	
	/**
	 * Setter for contact's patronymic
	 * @param patronymic which will be set to contact's patronymic
	 */
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	
	/**
	 * Getter for nickname
	 * @return contact's nickname
	 */
	public String getNickname() {
		return nickname;
	}
	
	/**
	 * Setter for contact's nickname
	 * @param nickname which will be set to contact's nickname
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	/**
	 * Getter for comment
	 * @return contact's comment
	 */
	public String getComment() {
		return comment;
	}
	
	/**
	 * Setter for contact's comment
	 * @param comment which will be set to contact's comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	/**
	 * Getter for group
	 * @return contact's group
	 */
	public Groups getGroup() {
		return group;
	}
	
	/**
	 * Setter for contact's group
	 * @param group which will be set to contact's group
	 */
	public void setGroup(Groups group) {
		this.group = group;
	}

	/**
	 * Getter for home phone
	 * @return contact's home phone
	 */
	public String getHomePhone() {
		return homePhone;
	}
	
	/**
	 * Setter for contact's home phone
	 * @param homePhone which will be set to contact's home phone
	 */
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	/**
	 * Getter for mobile phone
	 * @return contact's mobile phone
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}
	
	/**
	 * Setter for contact's mobile phone
	 * @param mobile phone which will be set to contact's mobile phone
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	
	/**
	 * Method that returns a string with some info about user
	 * @return short information about contact
	 */
	public String shortToString() {
		return lastName + " " + firstName.substring(0, 1) + ".";
	}
	
}
