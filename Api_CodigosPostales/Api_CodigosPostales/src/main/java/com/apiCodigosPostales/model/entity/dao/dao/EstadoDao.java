package com.apiCodigosPostales.model.entity.dao.dao;

import com.apiCodigosPostales.model.entity.dao.Estado;
import io.micronaut.context.annotation.Bean;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
import io.micronaut.data.repository.CrudRepository;

@Bean
@Repository
public interface EstadoDao extends JpaRepository<Estado,Integer> {

}
