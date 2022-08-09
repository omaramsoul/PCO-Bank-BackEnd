package com.dzadvisory.bankapp.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="zautsy10")
public class Zautsy10 {

    @Id @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AUTSY1ETA;

    @Column
    private String AUTSY1GPE;

    @Column
    private String AUTSY1CLI;

    @Column
    private double AUTSY1ADR;

    @Column
    private String AUTSY1TYP;

    @Column
    private String AUTSY1AUT;

    @Column
    private double AUTSY1PER;

    @Column
    private double AUTSY1SUI;

    @Column
    private String AUTSY1ELM;

    @Column
    private double AUTSY1NIV;

    @Column
    private double AUTSY1INT;

    @Column
    private double AUTSY1EFF;

    @Column
    private String AUTSY1PRO;

    @Column
    private double AUTSY1DEB;

    @Column
    private double AUTSY1FIN;

    @Column
    private double AUTSY1MON;

    @Column
    private String AUTSY1DEV;

    @Column
    private String AUTSY1BLO;

    @Column
    private String AUTSY1AMO;

    @Column
    private String AUTSY1GRP;

    @Column
    private String AUTSY1RES;

    @Column
    private double AUTSY1TAU;

    @Column
    private double AUTSY1DUR;

    @Column
    private String AUTSY1CON;

    @Column
    private double AUTSY1CET;

    @Column
    private String AUTSY1CUT;

    @Column
    private String AUTSY1UCR;

    @Column
    private String AUTSY1UVL;

    @Column
    private String AUTSY1UMO;

    @Column
    private double AUTSY1DVL;

    @Column
    private double AUTSY1;

    @Column
    private double AUTSY1DMO;
}

