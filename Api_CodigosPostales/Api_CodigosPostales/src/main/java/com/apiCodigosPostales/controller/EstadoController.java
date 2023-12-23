package com.apiCodigosPostales.controller;
import com.apiCodigosPostales.model.entity.dao.Estado;
import com.apiCodigosPostales.model.entity.dao.EstadoDao;
import com.apiCodigosPostales.service.IEstado;
import com.apiCodigosPostales.service.impl.Estadoimpl;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import javax.inject.Named;


@Controller("/api/v1")

public class EstadoController {
    public IEstado estadoSer;
    public EstadoController(@Named("implementacion") IEstado estadoSer){
        this.estadoSer=estadoSer;
    }
    @Post("estado")
    public Estado create  (@Body Estado estado){
        return estadoSer.save(estado);

    }

    @Put("estado")
    public Estado update (@Body Estado estado){
        return estadoSer.save(estado);

    }

    @Delete("estado/{id_estado}")
    public void delete (@PathVariable int id_estado){
        Estado estadoDelete =estadoSer.findById(id_estado);
        estadoSer.delete(estadoDelete);

    }

    @Get("estado/{id_estado}")
    public Estado showById(@PathVariable int id_estado){
        return estadoSer.findById(id_estado);
    }

   @Get("/saludar")
   public String saludar() {
       return "Pinches dependencias";
   }



}
