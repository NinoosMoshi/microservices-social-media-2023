package com.ninos.model.userrole;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

import com.ninos.model.role.Role;
import com.ninos.model.user.User;

@Data
@Entity
@Table(name = "user_role")
public class UserRole implements Serializable {

    @EmbeddedId
    private UserRoleKey userRoleKey;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @MapsId("userId")
    private User users;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @MapsId("roleId")
    private Role roles;
}
