package com.ninos.model.role;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class CompositeKey implements Serializable {

//    @Column(name = "integration_id")
    private Long integrationId;

//    @Column(name = "role_id")
    private Long roleId;

}
