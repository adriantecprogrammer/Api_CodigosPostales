package com.apiCodigosPostales.service.impl;

import com.apiCodigosPostales.model.entity.dao.Estado;
import com.apiCodigosPostales.model.entity.dao.EstadoDao;
import com.apiCodigosPostales.service.IEstado;
import io.micronaut.transaction.annotation.Transactional;

public class Estadoimpl implements IEstado {


    private EstadoDao estadoDao;
    @Override
    @Transactional()
    public Estado save(Estado estado) {
        return estadoDao.save(estado);
    }

    @Override
    @Transactional(readOnly = true)
    public Estado findById(int id) {
        return estadoDao.findById(id).orElse(null);
    }

    @Override
    @Transactional()
    public void delete(Estado estado) {
        estadoDao.delete(estado);

    }
}
