package com.duonglyne.duonggmail;
public class NoteModel {


    private String noteTitle;
    private String subTitle;

    public NoteModel() {
    }

    public NoteModel(String noteTitle, String subTitle) {
        this.noteTitle = noteTitle;
        this.subTitle = subTitle;

    }
/*public NoteModel(String noteTitle) {
        this.noteTitle = noteTitle;
    }*/

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
}