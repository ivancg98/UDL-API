package com.example.demospringdatarest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demospringdatarest.resources.Alumne;

@RepositoryRestResource(collectionResourceRel = "alumne", path = "alumne")
public interface AlumneRepository extends CrudRepository<Alumne, Integer> {

}
