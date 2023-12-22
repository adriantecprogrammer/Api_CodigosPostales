package com.apiCodigosPostales.service.impl;

import com.apiCodigosPostales.model.entity.dao.Colonia;
import com.apiCodigosPostales.model.entity.dao.ColoniaDao;
import com.apiCodigosPostales.service.IColonia;
import io.micronaut.transaction.annotation.Transactional;
import org.hibernate.service.spi.InjectService;

public class Coloniaimpl implements IColonia {

    ColoniaDao coloniaDao;
    @Override
    @Transactional
    public Colonia save(Colonia colonia) {
        return coloniaDao.save(colonia);
    }

    @Override
    @Transactional(readOnly = true)
    public Colonia findById(String colonia) {
        return coloniaDao.findById(colonia).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Colonia colonia) {
coloniaDao.delete(colonia);
    }
}
