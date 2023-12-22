package com.apiCodigosPostales.service;

import com.apiCodigosPostales.model.entity.dao.CodigoPostal;
import com.apiCodigosPostales.model.entity.dao.Colonia;

public interface IColonia {
    Colonia save(Colonia colonia);

    Colonia findById(String colonia);

    void delete(Colonia colonia);
}
