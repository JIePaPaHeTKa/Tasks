package ru.netology.tasks;
import java.util.Objects;

public abstract class Tasks {
    protected int id;
    public Tasks(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tasks task = (Tasks) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean matches(String query) {
        return false;
    }
}