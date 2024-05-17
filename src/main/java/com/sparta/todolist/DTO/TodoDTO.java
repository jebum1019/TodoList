package com.sparta.todolist.DTO;

import lombok.Data;

@Data
public class TodoDTO {
    private String id;
    private String title;
    private String content;
    private String assignee;
}
