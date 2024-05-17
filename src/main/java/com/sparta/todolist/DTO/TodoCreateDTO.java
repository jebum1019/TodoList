package com.sparta.todolist.DTO;

import lombok.Data;

@Data
public class TodoCreateDTO {
    private String title;
    private String content;
    private String assignee;
    private String password;
}

