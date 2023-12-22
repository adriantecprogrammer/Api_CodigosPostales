package com.apiCodigosPostales.model.entity.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Entity
@Table(name="Colonias")

public class Colonia implements Serializable {


    @Id
    @Column(name = "colonia")
    private String colonia;

    @Column(name="cp")
    private String cp;

}
