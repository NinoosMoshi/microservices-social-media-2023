package com.ninos.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninos.model.organization.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {


    Optional<Organization> findByReferenceId(String referenceId);
}
