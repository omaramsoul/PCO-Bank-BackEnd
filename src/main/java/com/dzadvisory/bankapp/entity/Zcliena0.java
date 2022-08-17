package com.dzadvisory.bankapp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
@Table(name="zcliena0")
public class Zcliena0 {

    @Id @Column @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CLIENACLI;

    @Column
    private int CLIENAETB;

    @Column
    private String CLIENAETA;

    @Column
    private String CLIENARA1;

    @Column
    private String CLIENARA2;

    @Column
    private String CLIENASIG;

    @Column
    private int CLIENASRN;

    @Column
    private double CLIENASRT;

    @Column
    private double CLIENADNA;

    @Column
    private String CLIENAREG;

    @Column
    private String CLIENANAT;

    @Column
    private String CLIENARSD;

    @Column
    private String CLIENARES;

    @Column
    private String CLIENAECO;

    @Column
    private String CLIENAACT;

    @Column
    private String CLIENAPAI;

    @Column
    private String CLIENACRD;

    @Column
    private String CLIENAADM;

    @Column
    private double CLIENAATR;

    @Column
    private double CLIENABIL;

    @Column
    private String CLIENACAT;

    @Column
    private String CLIENACOT;

    @Column
    private String CLIENACHQ;

    @Column
    private double CLIENADAT;

    @Column
    private String CLIENASAC;

    @Column
    private String CLIENAGEO;

    @Column
    private String CLIENAENT;

    @Column
    private String CLIENAMES;

    @Column
    private double CLIENAPAY;

    @Column
    private String CLIENAFIL;

    @Column
    private double CLIENABIM;

    @Column
    private int CLIENADOU;

    @Column
    private String CLIENALI1;

    @Column
    private String CLIENALI2;

    @Column
    private String CLIENAEXT;

    @Column
    private String CLIENACOL;

    @Column
    private String CLIENATIE;

    @Column
    private String CLIENASEL;

    @Column
    private String CLIENAPCS;

    @Column
    private int CLIENACRE;

}
