package com.jwt.demo.jwtspringsecurity3.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class JWTResponse {

    private String jwtToken;
     private String username;
}
