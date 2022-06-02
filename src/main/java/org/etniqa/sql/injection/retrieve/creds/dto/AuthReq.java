package org.etniqa.sql.injection.retrieve.creds.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class AuthReq {
    private final String login;
    private final String password;
}
