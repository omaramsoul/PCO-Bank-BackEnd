package com.dzadvisory.bankapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "zcrepla0")
public class Zcrepla0 implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private short CREPLAETA;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private short CREPLAAGE;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private String CREPLASER;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private String CREPLASSE;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int CREPLADOS;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int CREPLAPRE;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int CREPLAPLA;

    @Column private BigDecimal CREPLAMAM;
    @Column private BigDecimal CREPLAMIN;
    @Column private String CREPLAMOA;
    @Column private int CREPLANPC;
    @Column private String CREPLAPCA;
    @Column private int CREPLADEC;
    @Column private String CREPLADRE;
    @Column private int CREPLAJEC;
    @Column private String CREPLADTO;
    @Column private String CREPLADAM;
    @Column private int CREPLANPE;
    @Column private String CREPLAPIN;
    @Column private String CREPLAPEI;
    @Column private int CREPLADE1;
    @Column private String CREPLADIN;
    @Column private int CREPLAJE1;
    @Column private String CREPLAINC;
    @Column private BigDecimal CREPLATAF;
    @Column private String CREPLARTA;
    @Column private BigDecimal CREPLAMAR;
    @Column private BigDecimal CREPLATMI;
    @Column private BigDecimal CREPLATMA;
    @Column private String CREPLACTR;
    @Column private String CREPLAAPL;
    @Column private int CREPLADPR;
    @Column private String CREPLATVA;
    @Column private BigDecimal CREPLATXT;
    @Column private String CREPLATYR;
    @Column private BigInteger CREPLABAS;
    @Column private String CREPLAREA;
    @Column private int CREPLADUM;
    @Column private String CREPLATDU;
    @Column private String CREPLACDR;
    @Column private BigDecimal CREPLARES;
    @Column private String CREPLADEJ;
    @Column private int CREPLANBJ;
    @Column private String CREPLASIG;
    @Column private String CREPLATYJ;
    @Column private String CREPLAARR;
    @Column private String CREPLATYA;
    @Column private String CREPLACOT;
    @Column private String CREPLAMCA;
    @Column private BigDecimal CREPLAPOC;
    @Column private String CREPLAREL;
    @Column private String CREPLAPER;
    @Column private int CREPLADDC;
    @Column private String CREPLAPRC;
    @Column private int CREPLAMAC;
    @Column private String CREPLAEXT;
    @Column private String CREPLACLD;
    @Column private String CREPLATEO;
    @Column private String CREPLACAP;

}
