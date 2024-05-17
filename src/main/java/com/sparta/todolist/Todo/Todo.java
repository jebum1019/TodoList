package com.sparta.todolist.Todo;

import lombok.Data;

@Data
public class Todo {
    private String id;
    private String title;
    private String content;
    private String assignee;
    private String password;
}
