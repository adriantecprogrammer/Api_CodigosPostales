package com.apiCodigosPostales.controller;

import com.apiCodigosPostales.model.entity.dao.Estado;
import com.apiCodigosPostales.service.IEstado;
import com.apiCodigosPostales.service.impl.Estadoimpl;
import io.micronaut.http.annotation.*;
import lombok.AllArgsConstructor;

@Controller("/api/v1")
@AllArgsConstructor

public class EstadoController {
    private Estadoimpl estadoService;



    @Post("estado")
    public Estado create  (@RequestAttribute Estado estado){
        return estadoService.save(estado);

    }

    @Put("estado")
    public Estado update (@RequestAttribute Estado estado){
        return estadoService.save(estado);

    }

    @Delete("estado/{id_estado}")
    public void delete (@PathVariable int id_estado){
        Estado estadoDelete =estadoService.findById(id_estado);
        estadoService.delete(estadoDelete);


    }
    @Get("estado/{id_estado}")
    public Estado showById(@PathVariable int id_estado){
        return  estadoService.findById(id_estado);
    }

}
