package com.example.demospringdatarest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demospringdatarest.resources.Nota;

@RepositoryRestResource(collectionResourceRel = "nota", path = "nota")
public interface NotaRepository extends CrudRepository<Nota, Integer>{

}
