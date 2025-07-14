package com.example.Day4_SpringBootJavaIntern.Controller;

import com.example.Day4_SpringBootJavaIntern.Models.todo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class todocontroller {

    private List<todo> todoList = new ArrayList<>();

    @PostMapping("/add")
    public String addTodo(@RequestBody todo t) {
        todoList.add(t);
        return "Todo added successfully";
    }

    @GetMapping("/all")
    public List<todo> getAllTodos() {
        return todoList;
    }

    @GetMapping("/{id}")
    public todo getTodoById(@PathVariable int id) {
        for (todo t : todoList) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    @PutMapping("/update/{id}")
    public String updateTodo(@PathVariable int id, @RequestBody todo updatedTodo) {
        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).getId() == id) {
                todoList.set(i, updatedTodo);
                return "Todo updated successfully";
            }
        }
        return "Todo not found";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTodo(@PathVariable int id) {
        for (int i = 0; i < todoList.size(); i++) {
            if (todoList.get(i).getId() == id) {
                todoList.remove(i);
                return "Todo deleted successfully";
            }
        }
        return "Todo not found";
    }
}
