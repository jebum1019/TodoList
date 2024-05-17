package com.sparta.todolist.TodoService;

import com.sparta.todolist.DTO.TodoCreateDTO;
import com.sparta.todolist.DTO.TodoDTO;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    public void createTodo(TodoCreateDTO todoDTO) {
        // Todo를 생성하는 로직을 구현합니다.
    }

    public TodoDTO getTodoById(String id) {
        // id에 해당하는 Todo를 조회하고 TodoDTO로 매핑하여 반환합니다.
        return null;
    }

    public void updateTodo(String id, TodoCreateDTO todoDTO, String password) {
        // id에 해당하는 Todo를 수정하는 로직을 구현합니다.
    }

    public void deleteTodo(String id, String password) {
        // id에 해당하는 Todo를 삭제하는 로직을 구현합니다.
    }
}
