package com.apiCodigosPostales.service;

import com.apiCodigosPostales.model.entity.dao.CodigoPostal;
import com.apiCodigosPostales.model.entity.dao.Estado;

public interface ICodigoPostal {

    CodigoPostal save(CodigoPostal codigoPostal);

    CodigoPostal findById(String cp);

    void delete(CodigoPostal codigoPostal);
}
