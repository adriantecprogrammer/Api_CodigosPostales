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
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Municipios")


public class Municipio implements Serializable {
@Id
@Column(name = "id_municipio")
     private String id_municipio;
@Column(name="municipio")
     private String municipio;
@Column(name = "id_estado")
     private int id_estado;
}
