package com.sintad.backendpruebapractica.springsecurity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenCredentials {

    private String username;

    private String password;
}
