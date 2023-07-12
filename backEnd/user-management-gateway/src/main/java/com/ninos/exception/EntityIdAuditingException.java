package com.ninos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EntityIdAuditingException extends FieldException{


    public EntityIdAuditingException(String code, String field) {
        super(String.format("Field [%s] not allowed to pass when create a new entity", field),code, field);
    }


}
