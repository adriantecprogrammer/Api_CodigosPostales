package com.apiCodigosPostales.service;

import com.apiCodigosPostales.model.entity.dao.Estado;

public interface IEstado {
    Estado save(Estado estado);

    Estado findById(int id_estado);

    void delete(Estado estado);

}
