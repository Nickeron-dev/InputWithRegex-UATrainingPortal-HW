package org.java.main;

/**
 * Created by Koshkin Illia on 04.07.2021.
 */
public interface GlobalConstants {
	
	// Regex
	public static final String LAST_NAME_REGEX = "[A-Z][a-z]+";
	public static final String FIRST_NAME_REGEX = "[A-Z][a-z]+";
	public static final String PATRONYMIC_REGEX = "[A-Z][a-z]+";
	
	public static final String NICKNAME_REGEX = "[A-Z][a-z]+";
	public static final String COMMENT_REGEX = ".{1,64}";
	public static final String GROUP_REGEX = "FAMILY|FRIENDS|NEIGHBOURS|WORK|OTHER|family|friends|neighbours|work|other";
	
	public static final String PHONE_REGEX = "\\d{3}-\\d{3}-\\d{2}-\\d{2}";
	
}
