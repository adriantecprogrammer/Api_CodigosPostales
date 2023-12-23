package com.apiCodigosPostales.service.impl;

import com.apiCodigosPostales.model.entity.dao.Estado;
import com.apiCodigosPostales.model.entity.dao.EstadoDao;
import com.apiCodigosPostales.service.IEstado;
import io.micronaut.transaction.annotation.Transactional;


import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named("implementacion")
public class Estadoimpl implements IEstado {

    private EstadoDao estadoDao;
    public Estadoimpl (EstadoDao estadoDao){
        this.estadoDao=estadoDao;
    }

    @Transactional()
    @Override
    public Estado save(Estado estado) {
        return estadoDao.save(estado);
    }

    @Transactional(readOnly = true)
    @Override
    public Estado findById(int id_estado) {
        return estadoDao.findById(id_estado).orElse(null);
    }

    @Transactional()
    @Override
    public void delete(Estado estado) {
        estadoDao.delete(estado);

    }
}
