package com.dzadvisory.bankapp.entity;

import lombok.*;
import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="zincact0")
public class Zincact0 {

    @Id @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int INCACTETA;

    @Column
    private int INCACTAGE;

    @Column
    private String INCACTSER;

    @Column
    private String INCACTSSE;

    @Column
    private double INCACTIMP;

    @Column
    private int INCACTAGO;

    @Column
    private String INCACTSEO;

    @Column
    private String INCACTSSO;

    @Column
    private String INCACTOPE;

    @Column
    private double INCACTNOP;

    @Column
    private String INCACTNAT;

    @Column
    private double INCACTDCR;

    @Column
    private double INCACTMNG;

    @Column
    private double INCACTMNI;

    @Column
    private String INCACTCLI;

    @Column
    private String INCACTCLC;

    @Column
    private String INCACTTIR;

    @Column
    private String INCACTMOT;

    @Column
    private String INCACTSUP;

    @Column
    private String INCACTACE;

    @Column
    private String INCACTACO;

    @Column
    private String INCACTTRA;

    @Column
    private String INCACTDEC;

    @Column
    private String INCACTDEP;

    @Column
    private String INCACTDER;

    @Column
    private String INCACTDCO;

    @Column
    private double INCACTMIR;

    @Column
    private double INCACTMIE;

}
