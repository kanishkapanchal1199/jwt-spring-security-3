package com.jwt.demo.jwtspringsecurity3.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String userId;

    private String name;

    private String email;
}
