package com.apiCodigosPostales;

import io.micronaut.runtime.Micronaut;
import jakarta.inject.Singleton;

public class Application {



    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
      CConexion cConexion = new CConexion();
      cConexion.estableceConexion();

    }
}