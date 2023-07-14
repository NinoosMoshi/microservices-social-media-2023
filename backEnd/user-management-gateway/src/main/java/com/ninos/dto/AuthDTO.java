package com.ninos.dto;

import lombok.Data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ninos.model.enumeration.Scope;

@Data
public class AuthDTO {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("expire_at")
    private String expireAt;

    @JsonProperty("refresh_token")
    private String refreshToken;

    private List<String> roles;

    private boolean admin;

    private Scope scope;  // user or organization

}
