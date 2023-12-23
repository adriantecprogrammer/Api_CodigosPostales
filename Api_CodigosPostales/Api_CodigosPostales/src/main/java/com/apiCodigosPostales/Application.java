package com.apiCodigosPostales;

import io.micronaut.runtime.Micronaut;
import jakarta.inject.Singleton;

public class Application {

    @Singleton

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
        System.out.println("Hola");

    }
}