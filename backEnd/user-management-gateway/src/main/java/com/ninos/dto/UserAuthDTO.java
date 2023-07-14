package com.ninos.dto;


import lombok.Data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ninos.model.enumeration.Language;

@Data
public class UserAuthDTO {

    private String name;

    @JsonProperty("login_name")
    private String loginName;

    private String email;
    private String phone;
    private boolean admin;
    private Language language;


}
