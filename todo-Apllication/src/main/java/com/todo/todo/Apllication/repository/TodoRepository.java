package com.todo.todo.Apllication.repository;

import com.todo.todo.Apllication.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity , Long> {
}
