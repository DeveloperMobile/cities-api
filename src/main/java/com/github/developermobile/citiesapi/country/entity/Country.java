package com.github.developermobile.citiesapi.country.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "Country")
@Table(name = "pais")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String portugueseName;

    @Column(name = "sigla")
    private String code;


    private Integer bacen;
}
