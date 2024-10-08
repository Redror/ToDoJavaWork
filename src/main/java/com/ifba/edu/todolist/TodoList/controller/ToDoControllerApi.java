package com.ifba.edu.todolist.TodoList.controller;

import com.ifba.edu.todolist.TodoList.domain.dto.ToDoDTO;
import com.ifba.edu.todolist.TodoList.enuns.Status;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/todo")
public interface ToDoControllerApi {
    @PostMapping
    ToDoDTO create(@RequestBody @Valid ToDoDTO toDoDTO);
    @PutMapping("/{id}")
    ToDoDTO update(@PathVariable("id") Long id, @RequestBody @Valid ToDoDTO toDoDTO);
    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable("id") Long id);
    @GetMapping
    List<ToDoDTO> findAll();

    @GetMapping("/{id}")
    ToDoDTO findById(@PathVariable("id") Long id);

    @GetMapping("/status/{status}")
    List<ToDoDTO> findByStatus(@PathVariable("status") Status status);
}
