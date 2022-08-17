package com.dzadvisory.bankapp.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="zclinta0")
public class Zclinta0 {

        @Id @Column
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int CLINTANUM;

        @Column
        private int CLINTAETA;

        @Column
        private String CLINTATYP;

        @Column
        private double CLINTAPLA;

        @Column
        private String CLINTATYN;

        @Column
        private String CLINTASEQ;

        @Column
        private String CLINTANUT;

        @Column
        private String CLINTAOPT;

        @Column
        private int SABVERSION;

        @Column
        private String FILLER;

}


