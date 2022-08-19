package com.dzadvisory.bankapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="zautena0")
public class Zautena0 implements Serializable {

    @Id @Column private int AUTENAETA;
    @Id @Column private int AUTENADOS;
    @Column private String AUTENACLI;
    @Column private String AUTENAAUT;
    @Column private String AUTENADEV;
    @Column private float AUTENAENC;
    @Column private float AUTENAREP;
    @Column private int AUTENAAGE;
    @Column private String AUTENASER;
    @Column private String AUTENASRV;
    @Column private String AUTENAOPE;
    @Column private float AUTENAMBA;
    @Column private int AUTENADEB;
    @Column private int AUTENAFIN;
    @Column private String AUTENALIB;
    @Column private String AUTENANAT;
    @Column private String AUTENAMAJ;
    @Column private String AUTENA1T1;
    @Column private int AUTENADAT;
    @Column private int AUTENAHEU;

}
