package kr.pe.cumul.androidseminar;

public class Lecture {

    private String title;
    private String prof;

    public Lecture(String title, String prof) {
        this.title = title;
        this.prof = prof;
    }

    public String getTitle() {
        return title;
    }

    public String getProf() {
        return prof;
    }
}
