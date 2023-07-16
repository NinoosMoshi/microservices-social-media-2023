package com.ninos.organizationrole;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

import com.ninos.model.organization.Organization;
import com.ninos.model.role.CompositeKey;
import com.ninos.model.role.Role;
import com.ninos.model.user.User;

@Data
@Entity
@Table(name = "organization_role")
public class OrganizationRole implements Serializable {

    @EmbeddedId
    private CompositeKey compositeKey;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    @MapsId("integrationId")
    private Organization organizations;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @MapsId("roleId")
    private Role roles;
}
