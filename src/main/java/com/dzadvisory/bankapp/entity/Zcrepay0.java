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
@Table(name = "zcrepay0")
public class Zcrepay0 implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private short CREPAYETA;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private short CREPAYAGE;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private String CREPAYSER;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private String CREPAYSSE;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int CREPAYDOS;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int CREPAYPRE;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int CREPAYSEQ;

    @Column private String CREPAYNCL;
    @Column private String CREPAYMRE;
    @Column private BigInteger CREPAYPLA;
    @Column private String CREPAYCOM;
    @Column private BigDecimal CREPAYPEC;
    @Column private BigDecimal CREPAYPIN;
    @Column private BigDecimal CREPAYPAM;
    @Column private BigDecimal CREPAYTBO;
    @Column private BigDecimal CREPAYMON;
    @Column private String CREPAYSUP;
    @Column private String CREPAYLIA;
    @Column private String CREPAYDEV;
    @Column private BigDecimal CREPAYCRS;
    @Column private String CREPAYCRE;

}
