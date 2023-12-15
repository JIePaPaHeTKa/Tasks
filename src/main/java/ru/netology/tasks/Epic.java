package ru.netology.tasks;
public class Epic extends Tasks {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        for (String t : subtasks) {
            if (t.contains(query)) {
                return true;
            }
        }
        return false;
    }
}