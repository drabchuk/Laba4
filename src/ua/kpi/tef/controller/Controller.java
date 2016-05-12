package ua.kpi.tef.controller;

import ua.kpi.tef.model.Model;
import ua.kpi.tef.model.entities.Note;
import ua.kpi.tef.view.View;

import java.util.Scanner;

import static ua.kpi.tef.view.TextConstants.*;
import static ua.kpi.tef.controller.Regex.*;

/**
 * Created by Denis Drabchuck on 11.05.2016.
 */
public class Controller {



    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        view.printMessage(GREETING);
        view.printMessage(DESCRIPTION);

        Note note = handleUserInput(sc);

        view.printNote(note);
    }

    private Note handleUserInput(Scanner sc) {
        String surname = inputStringWithScanner(INPUT + SURNAME, sc, REGEX_NAME);
        String name = inputStringWithScanner(INPUT + NAME, sc, REGEX_NAME);
        String middleName = inputStringWithScanner(INPUT + MIDDLE_NAME, sc, REGEX_NAME);
        String nickname = inputStringWithScanner(INPUT + NICKNAME, sc, REGEX_NICK);
        String comment = inputStringWithScanner(INPUT + COMMENT, sc, REGEX_COMMENT);
        String group = inputStringWithScanner(INPUT + GROUP, sc, REGEX_GROUP);
        String homePhone = inputStringWithScanner(INPUT + HOME_PHONE, sc, REGEX_HOME_PHONE);
        String mobilePhone = inputStringWithScanner(INPUT + MOBILE_PHONE, sc, REGEX_MOBILE_PHONE);
        String email = inputStringWithScanner(INPUT + EMAIL, sc, REGEX_MAIL);
        String skype = inputStringWithScanner(INPUT + SKYPE, sc, REGEX_SKYPE);
        String zip = inputStringWithScanner(INPUT + ZIP, sc, REGEX_ZIP);
        String city = inputStringWithScanner(INPUT + CITY, sc, REGEX_CITY);
        String street = inputStringWithScanner(INPUT + STREET, sc, REGEX_STREET);
        String building = inputStringWithScanner(INPUT + BUILDING, sc, REGEX_BUILDING);
        String apartment = inputStringWithScanner(INPUT + APARTMENT, sc, REGEX_APARTMENT);

        return new Note(name, surname, middleName, nickname, comment,
                group, homePhone, mobilePhone, email, skype, zip, city,
                street, building, apartment);
    }

    // The Utility methods

    public String inputStringWithScanner(String message, Scanner sc, String pattern) {
        view.printMessage(message);
        String input;
        while(true) {
            input = sc.nextLine();
            if(input.matches(pattern)) {
                return input;
            }
            view.printMessagesLn(WRONG_INPUT_INT_DATA, message);
        }
    }
}
