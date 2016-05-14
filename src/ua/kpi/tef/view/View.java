package ua.kpi.tef.view;


import ua.kpi.tef.model.entities.Note;
import static ua.kpi.tef.view.TextConstants.*;

/**
 * Created by Denis Drabchuck on 11.05.2016.
 */
public class View {

    public void printMessage(String  message){
        System.out.println(message);
    }

    public void printMessages(Object... objMessages){
        for (Object message: objMessages) {
            System.out.print(message.toString());
        }
        System.out.println();
    }

    public void printMessagesLn(Object... objMessages){
        for (Object message: objMessages) {
            System.out.println(message.toString());
        }
    }

    public void printNote(Note note) {
        printMessage(DIVIDER);
        printMessages(NOTE_HEADER, note.getFullName());
        printMessage(DIVIDER);
        printMessages(SURNAME, COLON, note.getSurname());
        printMessages(NAME, COLON, note.getName());
        printMessages(MIDDLE_NAME, COLON, note.getMiddleName());
        printMessages(NICKNAME, COLON, note.getNickname());
        printMessages(COMMENT, COLON, note.getComment());
        printMessages(GROUP, COLON, note.getGroup().name());
        printMessages(HOME_PHONE, COLON, note.getHomePhone());
        printMessages(MOBILE_PHONE, COLON, note.getMobilePhone());
        printMessages(EMAIL, COLON, note.getEmail());
        printMessages(SKYPE, COLON, note.getSkype());
        printMessages(ADDRESS, COLON);
        printMessages(ZIP, COLON, note.getAddress().getZip());
        printMessages(CITY, COLON, note.getAddress().getCity());
        printMessages(STREET, COLON, note.getAddress().getStreet());
        printMessages(BUILDING, COLON, note.getAddress().getBuilding());
        printMessages(APARTMENT, COLON, note.getAddress().getApartment());
        printMessages(CREATE_DATE, COLON, note.getCreateDate().toString());
        printMessages(UPDATE_DATE, COLON, note.getUpdateDate().toString());
        printMessagesLn();
        printMessages(COMMON_ADDRESS, COLON, note.getCommonAddress());
        printMessages(POSTAL_ADDRESS, COLON, note.getPostalAddress());
    }

}
