package ua.kpi.tef.model;

import ua.kpi.tef.model.entities.Note;
import ua.kpi.tef.model.entities.Notebook;

/**
 * Created by Denis Drabchuck on 11.05.2016.
 */
public class Model {

    Note note;

    public void setNote(Note note) {
        this.note = note;
    }

    public Note getNote() {
        return note;
    }
}
