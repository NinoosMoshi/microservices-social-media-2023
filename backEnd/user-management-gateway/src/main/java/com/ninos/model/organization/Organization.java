package com.ninos.model.organization;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

import com.ninos.model.BaseEntity;
import com.ninos.model.userrole.UserRole;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name = "organization")
public class Organization extends BaseEntity {

    @Column(name = "reference_id")
    private String referenceId;

    @Column(name = "organization_name")
    private String organizationName;

    @Column(name = "password")
    private String password;




}
