package com.dzadvisory.bankapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "zdecmou0")
public class Zdecmou0 {

    @Id @Column private String DECMOUCOM;
    @Column private int DECMOUETA;
    @Column private int DECMOUAGE;
    @Column private String DECMOUSER;
    @Column private int DECMOUDTR;
    @Column private String DECMOUSSE;
    @Column private String DECMOUCOP;
    @Column private int DECMOUNOP;
    @Column private int DECMOUDRE;
    @Column private int DECMOUDLR;
    @Column private int DECMOUUIN;
    @Column private int DECMOUDCR;
    @Column private int DECMOUDUT;
    @Column private int DECMOUUTI;
    @Column private String DECMOUREA;
    @Column private int DECMOUNSQ;
    @Column private String DECMOUFUT;
    @Column private String DECMOUORI;
    @Column private String DECMOUNAT;
    @Column private String DECMOUMRE;
    @Column private int DECMOUREQ;
    @Column private String DECMOUAPS;
    @Column private String DECMOUMOS;
    @Column private String DECMOUCNE;
    @Column private String DECMOUCBA;
    @Column private float DECMOUMNT;
    @Column private int DECMOUPLA;
    @Column private String DECMOUDEV;
    @Column private String DECMOUBLQ;
    @Column private String DECMOUACA;
    @Column private String DECMOUTIT;
    @Column private String DECMOUHIE;
    @Column private String DECMOUDEC;

}
