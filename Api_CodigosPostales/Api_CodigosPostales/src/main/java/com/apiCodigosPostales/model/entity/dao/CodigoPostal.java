package com.apiCodigosPostales.model.entity.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Table(name = "CodigoPostal")

public class CodigoPostal implements Serializable {

    @Id
    @Column(name = "cp")
    private String cp;
    @Column(name = "id_municipio")
    private String id_municipio;

}
