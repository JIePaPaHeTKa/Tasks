package ru.netology.tasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTask {
    @Test
    public void shouldMatchesForSimpleTaskIfTrue() {
        Simples task = new Simples(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = task.matches("Позвонить");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMatchesForSimpleTaskIfFalse() {
        Simples task = new Simples(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = task.matches("позвонить");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMatchesForEpicIfTrue() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic task = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = task.matches("Яйца");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMatchesForEpicIfFalse() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic task = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = task.matches("Кефир");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMatchesForMeetingIfTrue() {
        Meetings task = new Meetings(555, "Выкатка 3й версии приложения","Приложение НетоБанка","Во вторник после обеда");

        boolean expected = true;
        boolean actual = task.matches("НетоБанка");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMatchesForMeetingIfFalse() {
        Meetings task = new Meetings(555, "Выкатка 3й версии приложения","Приложение НетоБанка","Во вторник после обеда");

        boolean expected = false;
        boolean actual = task.matches("3 версия");

        Assertions.assertEquals(expected, actual);
    }
}