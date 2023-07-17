package com.ninos.model.organization;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

import com.ninos.model.BaseEntity;
import com.ninos.model.enumeration.Scope;
import com.ninos.model.userrole.UserRole;
import com.ninos.organizationrole.OrganizationRole;

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


    @Column(name = "scope")
    @Enumerated(EnumType.STRING)
    private Scope scope;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "organizations")
    private List<OrganizationRole> roles;




}
