package ru.netology.tasks;
public class WhatToDo {
    private Tasks[] tasks = new Tasks[0];
    private Tasks[] addToArray(Tasks[] current, Tasks task) {
        Tasks[] tmp = new Tasks[current.length + 1];
        for (int i = 0; i < current.length; i++) {
            tmp[i] = current[i];
        }
        tmp[tmp.length - 1] = task;
        return tmp;
    }
    public void add(Tasks task) {
        tasks = addToArray(tasks, task);
    }
    public Tasks[] findAll() {
        return tasks;
    }
    public Tasks[] search(String query) {
        Tasks[] result = new Tasks[0]; // массив для ответа
        for (Tasks task : tasks) { // перебираем все задачи
            if (task.matches(query)) { // если задача подходит под запрос
                result = addToArray(result, task); // добавляем её в массив ответа
            }
        }
        return result;
    }
}