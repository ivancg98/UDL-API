package com.example.demospringdatarest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demospringdatarest.resources.Assignatura;

@RepositoryRestResource(collectionResourceRel = "assignatura", path = "assignatura")
public interface AssignaturaRepository extends CrudRepository<Assignatura, Integer> {
}
