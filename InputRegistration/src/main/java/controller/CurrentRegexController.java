package controller;

import view.View;

/**
 * This class chooses regex according to current bundle
 * @author Illia Koshkin
 */
public class CurrentRegexController {

    // 1st - regex; 2nd - language; 3rd - purpose
    private static final String[][] allRegexes= {
            {"[A-Z][a-z]{1,20}$", "", "lastName"},
            {"[A-Z][a-z]{1,20}$", "", "firstName"},
            {"[A-Z][a-z]{1,20}$", "", "patronymic"},

            {"^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$", "ua", "lastName"},
            {"^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$", "ua", "firstName"},
            {"^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$", "ua", "patronymic"}
    };

    /**
     * First name regex getter.
     * @return regex String for first name(according to current language)
     */
    public static String getFirstNameRegex() {
        for (int i = allRegexes.length - 1; i >= 0; i--) {
            if (View.bundle.getLocale().getLanguage().equalsIgnoreCase(allRegexes[i][1])
                    && allRegexes[i][2].equalsIgnoreCase("firstName")) {
                return allRegexes[i][0];
            }
        }
        return "";
    }

    /**
     * Last name regex getter.
     * @return regex String for last name(according to current language)
     */
    public static String getLastNameRegex() {
        for (int i = allRegexes.length - 1; i >= 0; i--) {
            if (View.bundle.getLocale().getLanguage().equalsIgnoreCase(allRegexes[i][1])
                    && allRegexes[i][2].equalsIgnoreCase("lastName")) {
                return allRegexes[i][0];
            }
        }
        return "";
    }

    /**
     * Patronymic regex getter.
     * @return regex String for patronymic(according to current language)
     */
    public static String getPatronymicRegex() {
        for (int i = allRegexes.length - 1; i >= 0; i--) {
            if (View.bundle.getLocale().getLanguage().equalsIgnoreCase(allRegexes[i][1])
                    && allRegexes[i][2].equalsIgnoreCase("patronymic")) {
                return allRegexes[i][0];
            }
        }
        return "";
    }
}
