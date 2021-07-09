package controller;

import view.View;

/**
 * This class chooses regex according to current bundle
 */
public class CurrentRegexController {

    // 1st - regex; 2nd - language; 3rd - purpose
    private static String[][] allRegexes= {
            {"[A-Z][a-z]{1,20}$", "", "lastName"},
            {"[A-Z][a-z]{1,20}$", "", "firstName"},
            {"[A-Z][a-z]{1,20}$", "", "patronymic"},

            {"^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$", "ua", "lastName"},
            {"^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$", "ua", "firstName"},
            {"^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$", "ua", "patronymic"}
    };

    public static String getFirstNameRegex() {
        for (int i = allRegexes.length - 1; i >= 0; i--) {
            if (View.bundle.getLocale().getLanguage().equalsIgnoreCase(allRegexes[i][1])
                    && allRegexes[i][2].equalsIgnoreCase("firstName")) {
                return allRegexes[i][0];
            }
        }
        return "";
    }

    public static String getLastNameRegex() {
        for (int i = allRegexes.length - 1; i >= 0; i--) {
            if (View.bundle.getLocale().getLanguage().equalsIgnoreCase(allRegexes[i][1])
                    && allRegexes[i][2].equalsIgnoreCase("lastName")) {
                return allRegexes[i][0];
            }
        }
        return "";
    }

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
