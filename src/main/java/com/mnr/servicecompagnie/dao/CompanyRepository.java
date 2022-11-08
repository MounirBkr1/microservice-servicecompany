package com.mnr.servicecompagnie.dao;

import com.mnr.servicecompagnie.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//spring data rest
@RepositoryRestResource
public interface CompanyRepository extends JpaRepository<Company,Long> {
}
