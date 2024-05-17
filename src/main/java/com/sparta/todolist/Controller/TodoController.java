package com.sparta.todolist.Controller;

import com.sparta.todolist.DTO.TodoCreateDTO;
import com.sparta.todolist.DTO.TodoDTO;
import com.sparta.todolist.TodoService.TodoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public void createTodo(@RequestBody TodoCreateDTO todoDTO) {
        todoService.createTodo(todoDTO);
    }

    @GetMapping("/{id}")
    public TodoDTO getTodoById(@PathVariable String id) {
        return todoService.getTodoById(id);
    }

    @PutMapping("/{id}")
    public void updateTodo(@PathVariable String id, @RequestBody TodoCreateDTO todoDTO, @RequestParam String password) {
        todoService.updateTodo(id, todoDTO, password);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable String id, @RequestParam String password) {
        todoService.deleteTodo(id, password);
    }
}

