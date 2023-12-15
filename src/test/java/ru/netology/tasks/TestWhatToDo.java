package ru.netology.tasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWhatToDo {
    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        Simples simpleTask = new Simples(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meetings meeting = new Meetings(555, "Выкатка 3й версии приложения","Приложение НетоБанка","Во вторник после обеда");

        WhatToDo todos = new WhatToDo();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Tasks[] expected = {simpleTask, epic, meeting};
        Tasks[] actual = todos.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSearchWhenResultFound() {
        Simples simpleTask = new Simples(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meetings meeting = new Meetings(555, "Выкатка 3й версии приложения","Приложение НетоБанка","Во вторник после обеда");

        WhatToDo todos = new WhatToDo();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Tasks[] actual = todos.search("Молоко");
        Tasks[] expected = {epic};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSearchIfNotFound() {
        Simples simpleTask = new Simples(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meetings meeting = new Meetings(555, "Выкатка 3й версии приложения","Приложение НетоБанка","Во вторник после обеда");

        WhatToDo todos = new WhatToDo();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Tasks[] actual = todos.search("Яблоко");
        Tasks[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSearchWhenResultMoreOne() {
        Simples simpleTask = new Simples(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meetings meeting = new Meetings(555, "Выкатка 3й версии приложения","Приложение НетоБанка","Во вторник после обеда");

        WhatToDo todos = new WhatToDo();
        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Tasks[] actual = todos.search("о");
        Tasks[] expected = {simpleTask, epic, meeting};

        Assertions.assertArrayEquals(expected, actual);
    }
}