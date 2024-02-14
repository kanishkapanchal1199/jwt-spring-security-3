package com.jwt.demo.jwtspringsecurity3.models;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class JWTRequest {

    private String email;
    private String password;
}
