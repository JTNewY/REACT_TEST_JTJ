package com.aloha.server.service;

import java.util.List;

import com.aloha.server.dto.Todo;

public interface TodoService {
    public List<Todo> list() throws Exception;

    public Todo select(int no) throws Exception;

    public int insert(Todo todo) throws Exception;

    public int update(Todo todo) throws Exception;

    public int delete(int no) throws Exception;

    public int lastId() throws Exception;

    public int completeAll() throws Exception;

    public int deleteAll() throws Exception;

}
