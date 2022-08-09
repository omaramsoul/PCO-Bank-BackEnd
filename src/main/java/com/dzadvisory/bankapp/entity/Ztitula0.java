package com.dzadvisory.bankapp.entity;

import lombok.*;
import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="ztitula0")
public class Ztitula0 {

    @Id @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TITULAETA;

    @Column
    private double TITULAPLA;

    @Column
    private String TITULACOM;

    @Column
    private String TITULACLI;

    @Column
    private String TITULAPRI;

    @Column
    private String TITULATPR;

}

