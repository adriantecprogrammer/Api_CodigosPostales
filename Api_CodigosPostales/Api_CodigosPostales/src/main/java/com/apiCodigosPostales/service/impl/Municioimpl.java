package com.apiCodigosPostales.service.impl;

import com.apiCodigosPostales.model.entity.dao.Municipio;
import com.apiCodigosPostales.model.entity.dao.MunicipioDao;
import com.apiCodigosPostales.service.IMunicipio;
import io.micronaut.transaction.annotation.Transactional;
import org.hibernate.service.spi.InjectService;



public class Municioimpl implements IMunicipio {


    MunicipioDao municipioDao;
    @Override
    @Transactional
    public Municipio save(Municipio municipio) {
        return municipioDao.save(municipio) ;
    }

    @Override
    @Transactional(readOnly = true)
    public Municipio findById(String id_municipio) {
        return municipioDao.findById(id_municipio).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Municipio municipio) {
municipioDao.delete(municipio);
    }
}
