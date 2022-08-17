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
@Table(name="zcrepre0")
public class Zcrepre0 implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private short CREPREETA;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private short CREPREAGE;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private String CREPRESCE;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private String CREPRESSE;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int CREPREDOS;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int CREPREPRE;

    @Column private String CREPRENAT;
    @Column private String CREPREDEV;
    @Column private int CREPREDAE;
    @Column private int CREPREDPE;
    @Column private int CREPRECAL;
    @Column private int CREPREDAI;
    @Column private int CREPREDPI;
    @Column private int CREPREDET;
    @Column private int CREPREOUV;
    @Column private int CREPREDER;
    @Column private int CREPREDIC;
    @Column private BigDecimal CREPREMON;
    @Column private BigDecimal CREPRECAP;
    @Column private BigDecimal CREPREINT;
    @Column private BigDecimal CREPREICO;
    @Column private BigDecimal CREPREICV;
    @Column private BigDecimal CREPRECRS;
    @Column private int CREPRECTA;
    @Column private int CREPREPLA;
    @Column private int CREPREPAL;
    @Column private int CREPREECH;
    @Column private String CREPREAVI;
    @Column private String CREPRETYR;
    @Column private String CREPREINR;
    @Column private BigInteger CREPREBAS;
    @Column private String CREPRETYS;
    @Column private String CREPREPRC;
    @Column private int CREPRESUP;
    @Column private int CREPRECOM;
    @Column private String CREPREAUT;
    @Column private short CREPREUTI;
    @Column private String CREPREOBJ;
    @Column private String CREPREBAR;
    @Column private String CREPREREM;
    @Column private String CREPREIMP;
    @Column private BigDecimal CREPREFNC;
    @Column private short CREPREINC;
    @Column private String CREPRETDO;
    @Column private String CREPRESUS;
    @Column private String CREPREEXI;
    @Column private String CREPREAGI;
    @Column private String CREPRERGL;
    @Column private short CREPRECOD;
    @Column private int CREPREOPT;
    @Column private BigDecimal CREPRECIA;
    @Column private BigDecimal CREPRECIC;
    @Column private int CREPREPCP;
    @Column private int CREPRENBR;
    @Column private String CREPRECLD;

}
