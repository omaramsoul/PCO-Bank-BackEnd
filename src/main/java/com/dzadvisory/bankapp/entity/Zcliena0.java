package com.dzadvisory.bankapp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="zcliena0")
public class Zcliena0 {

    @Id @Column @Getter @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CLIENACLI;

    @Column @Getter @Setter
    private int CLIENAETB;

    @Column @Getter @Setter
    private String CLIENAETA;

    @Column @Getter @Setter
    private String CLIENARA1;

    @Column @Getter @Setter
    private String CLIENARA2;

    @Column @Getter @Setter
    private String CLIENASIG;

    @Column @Getter @Setter
    private int CLIENASRN;

    @Column @Getter @Setter
    private double CLIENASRT;

    @Column @Getter @Setter
    private double CLIENADNA;

    @Column @Getter @Setter
    private String CLIENAREG;

    @Column @Getter @Setter
    private String CLIENANAT;

    @Column @Getter @Setter
    private String CLIENARSD;

    @Column @Getter @Setter
    private String CLIENARES;

    @Column @Getter @Setter
    private String CLIENAECO;

    @Column @Getter @Setter
    private String CLIENAACT;

    @Column @Getter @Setter
    private String CLIENAPAI;

    @Column @Getter @Setter
    private String CLIENACRD;

    @Column @Getter @Setter
    private String CLIENAADM;

    @Column @Getter @Setter
    private double CLIENAATR;

    @Column @Getter @Setter
    private double CLIENABIL;

    @Column @Getter @Setter
    private String CLIENACAT;

    @Column @Getter @Setter
    private String CLIENACOT;

    @Column @Getter @Setter
    private String CLIENACHQ;

    @Column @Getter @Setter
    private double CLIENADAT;

    @Column @Getter @Setter
    private String CLIENASAC;

    @Column @Getter @Setter
    private String CLIENAGEO;

    @Column @Getter @Setter
    private String CLIENAENT;

    @Column @Getter @Setter
    private String CLIENAMES;

    @Column @Getter @Setter
    private double CLIENAPAY;

    @Column @Getter @Setter
    private String CLIENAFIL;

    @Column @Getter @Setter
    private double CLIENABIM;

    @Column @Getter @Setter
    private int CLIENADOU;

    @Column @Getter @Setter
    private String CLIENALI1;

    @Column @Getter @Setter
    private String CLIENALI2;

    @Column @Getter @Setter
    private String CLIENAEXT;

    @Column @Getter @Setter
    private String CLIENACOL;

    @Column @Getter @Setter
    private String CLIENATIE;

    @Column @Getter @Setter
    private String CLIENASEL;

    @Column @Getter @Setter
    private String CLIENAPCS;

    @Column @Getter @Setter
    private int CLIENACRE;

}
