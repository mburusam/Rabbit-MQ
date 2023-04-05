package com.smburu.rabbitmq.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class User {
    private int id;
    private String firstName;
    private String lastName;
}
