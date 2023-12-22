package com.apiCodigosPostales.service.impl;

import com.apiCodigosPostales.model.entity.dao.CodigoPostal;
import com.apiCodigosPostales.model.entity.dao.CodigoPostalDao;
import com.apiCodigosPostales.service.ICodigoPostal;
import io.micronaut.transaction.annotation.Transactional;

public class CodigoPostalimpl implements ICodigoPostal {

    CodigoPostalDao codigoPostalDao;
    @Override
    @Transactional
    public CodigoPostal save(CodigoPostal codigoPostal) {
        return codigoPostalDao.save(codigoPostal);
    }

    @Override
    @Transactional(readOnly = true)
    public CodigoPostal findById(String cp) {
        return codigoPostalDao.findById(cp).orElse(null);
    }

    @Override
    @Transactional
    public void delete(CodigoPostal codigoPostal) {
codigoPostalDao.delete(codigoPostal);
    }
}
