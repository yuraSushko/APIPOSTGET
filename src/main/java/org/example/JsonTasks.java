package org.example;

public class JsonTasks {
    private String title;
    private String date;
    private boolean done;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "JsonTasks{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", done='" + done + '\'' +
                '}';
    }
}
