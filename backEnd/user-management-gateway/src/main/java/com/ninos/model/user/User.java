package com.ninos.model.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

import com.ninos.model.BaseEntity;
import com.ninos.model.enumeration.Language;
import com.ninos.model.userrole.UserRole;


@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class User extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "login_name")
    private String loginName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "admin")
    private boolean admin;

    @Column(name = "language")
    @Enumerated(EnumType.STRING)
    private Language language;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "users")
    private List<UserRole> roles = new ArrayList<>();

}
