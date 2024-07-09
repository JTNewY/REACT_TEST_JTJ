package com.aloha.server.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Todo {
    
    private int no;
    private String name;
    private int status;
    // 0: false, 1: true
    private Date regDate;
    private Date updDate;
}
