package com.dzadvisory.bankapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="zcredos0")
public class Zcredos0 implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private short CREDOSETA;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private short CREDOSAGE;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private String CREDOSSER;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private String CREDOSSSE;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int CREDOSDOS;

    @Column private String CREDOSNCR;
    @Column private BigDecimal CREDOSMNT;
    @Column private String CREDOSDEV;
    @Column private int CREDOSDDE;
    @Column private int CREDOSDFI;
    @Column private String CREDOSREF;
    @Column private short CREDOSUTI;
    @Column private int CREDOSDMO;
    @Column private String CREDOSOFI;
    @Column private int CREDOSCET;
    @Column private int CREDOSDCE;
    @Column private int CREDOSDOD;
    @Column private int CREDOSDVA;
    @Column private int CREDOSDGE;
    @Column private String CREDOSTYP;
    @Column private int CREDOSCOP;

}
