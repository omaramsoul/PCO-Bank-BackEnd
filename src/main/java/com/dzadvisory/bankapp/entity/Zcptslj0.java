package com.dzadvisory.bankapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "zcptslj0")
public class Zcptslj0 implements Serializable {

    @Id @Column private short CPTSLJETA;

    @Id @Column private int CPTSLJPLA;

    @Id @Column private String CPTSLJCOM;

    @Id @Column private int CPTSLJDCP;

    @Column private BigDecimal CPTSLJSLD;

    @Column private String CPTSLJSEN;

    @Column private int CPTSLJDTR;

}
