package com.springdata.primeiroprojetospring.repository;


import com.springdata.primeiroprojetospring.orm.Cargos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface  CargoRepository  extends CrudRepository <Cargos, Integer> {

}
