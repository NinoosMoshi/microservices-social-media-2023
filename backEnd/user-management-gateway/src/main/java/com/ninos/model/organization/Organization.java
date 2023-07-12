package com.ninos.model.organization;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import com.ninos.model.BaseEntity;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name = "organization")
public class Organization extends BaseEntity {

    @Column(name = "reference_id")
    private String referenceId;

    @Column(name = "organizatin_name")
    private String organizationName;

    @Column(name = "password")
    private String password;


}
