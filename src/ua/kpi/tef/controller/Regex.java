package ua.kpi.tef.controller;

/**
 * Created by Денис on 11.05.2016.
 */
public interface Regex {

    // The Regex

    // «Denis»
    String REGEX_NAME = "^[A-Z][a-zA-Z'-]{3,30}$";

    // «Nick-name1»
    String REGEX_NICK = "^[A-Za-z1-9_'.]{3,30}$";

    // «bla - bla - bla»
    String REGEX_COMMENT = ".*";

    // «First»
    String REGEX_GROUP = "^((F|f)irst)|((S|s)econd)|((T|t)hird)&";

    // «+38(044)555-55-55»
    String REGEX_HOME_PHONE =  "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";

    // «+38(044)555-55-55»
    String REGEX_MOBILE_PHONE =  "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";



    // «nick@mail.com»
    String REGEX_MAIL =
            "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+" +
                    "(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";

    // «skype123»
    String REGEX_SKYPE = "^[a-zA-Z][a-zA-Z0-9\\.,\\-_]{5,31}$";

    // «12345»
    String REGEX_ZIP = "^\\d{5}$";

    // «Kiev»
    String REGEX_CITY = "^[A-Z][a-zA-Z-' ]{1,63}$";

    // «Ivana Franka»
    String REGEX_STREET = "^[A-Z][a-zA-Z' ]{1,63}$";

    // «5»
    String REGEX_BUILDING = "^\\d{1,4}$";

    // «202»
    String REGEX_APARTMENT = "^\\d{1,4}$";


}
