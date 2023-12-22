package com.apiCodigosPostales.model.entity.dao;


import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "Estado")

public class Estado implements Serializable {
    @Id
    @Column(name = "id_estados")
   private  int id_estados ;
    @Column(name ="estados")
  private  String estados;

}
