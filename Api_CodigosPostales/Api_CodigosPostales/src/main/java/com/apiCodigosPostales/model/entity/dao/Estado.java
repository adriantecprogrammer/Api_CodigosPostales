package com.apiCodigosPostales.model.entity.dao;


import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "estados")

@Serdeable.Serializable
public class Estado{
    @Id
    @Column(name = "id_estados")
   public int id ;

    @Column(name ="estados")
  public String estados;

}
