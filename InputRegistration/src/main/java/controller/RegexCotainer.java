package controller;

/**
 * Global regex constants
 * @author Illia Koshkin
 *
 */
public interface RegexCotainer {

    // Regex
    public static final String LAST_NAME_REGEX = "[A-Z][a-z]+";
    public static final String FIRST_NAME_REGEX = "[A-Z][a-z]+";
    public static final String PATRONYMIC_REGEX = "[A-Z][a-z]+";

    public static final String LAST_NAME_REGEX_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    public static final String FIRST_NAME_REGEX_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    public static final String PATRONYMIC_REGEX_UA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";

    public static final String NICKNAME_REGEX = "[A-Z][a-z]+";
    public static final String COMMENT_REGEX = ".{1,64}";
    public static final String GROUP_REGEX = "FAMILY|FRIENDS|NEIGHBOURS|WORK|OTHER|family|friends|neighbours|work|other";

    public static final String HOME_PHONE_REGEX = "044-\\d{3}-\\d{2}-\\d{2}";
    public static final String MOBILE_PHONE_REGEX = "\\d{3}-\\d{3}-\\d{2}-\\d{2}";

}
