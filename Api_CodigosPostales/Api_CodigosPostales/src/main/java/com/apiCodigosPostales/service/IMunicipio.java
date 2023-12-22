package com.apiCodigosPostales.service;

import com.apiCodigosPostales.model.entity.dao.Estado;
import com.apiCodigosPostales.model.entity.dao.Municipio;

public interface IMunicipio {

    Municipio save(Municipio municipio);

    Municipio findById(String id_municipio);

    void delete(Municipio municipio);
}
