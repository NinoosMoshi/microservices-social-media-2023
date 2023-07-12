package com.ninos.model.role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

import com.ninos.model.BaseEntity;
import com.ninos.model.userrole.UserRole;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Role extends BaseEntity {

   @Column(name = "code")
   private String code;// admin

   @Column(name = "display_name")
   private String displayName;     // Admin


   @OneToMany(fetch = FetchType.EAGER, mappedBy = "roles")
   List<UserRole> userRoles = new ArrayList<>();


}
