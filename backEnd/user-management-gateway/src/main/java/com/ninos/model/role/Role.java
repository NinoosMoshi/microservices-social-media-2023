package com.ninos.model.role;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import com.ninos.model.BaseEntity;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Role extends BaseEntity {

   private String code;            // admin
   private String displayName;     // Admin


}
