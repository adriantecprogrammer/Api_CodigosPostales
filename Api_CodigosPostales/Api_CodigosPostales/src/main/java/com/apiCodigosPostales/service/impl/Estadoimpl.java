package com.apiCodigosPostales.service.impl;

import com.apiCodigosPostales.model.entity.dao.Estado;
import com.apiCodigosPostales.model.entity.dao.dao.EstadoDao;
import io.micronaut.transaction.annotation.Transactional;

import javax.inject.Singleton;

@Singleton
public class Estadoimpl {
    private EstadoDao estadoDao;
    public Estadoimpl (EstadoDao estadoDao){
        this.estadoDao=estadoDao;
    }

    public Estado save(Estado estado) {
    return estadoDao.save(estado);
    }

    public Estado findById(int id_estado) {
        return estadoDao.findById(id_estado).orElse(null);
    }

    public void delete(Estado estado) {
        estadoDao.delete(estado);

    }
}
