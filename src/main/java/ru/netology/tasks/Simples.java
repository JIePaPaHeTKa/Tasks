package ru.netology.tasks;
public class Simples extends Tasks {
    protected String title;
    public Simples(int id, String title) {
        super(id);
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public boolean matches(String query) {
        if (title.contains(query)) {
            return true;
        }
        return false;
    }
}