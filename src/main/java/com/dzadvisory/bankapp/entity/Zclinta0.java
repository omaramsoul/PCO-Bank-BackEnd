package com.dzadvisory.bankapp.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="zclinta0")
public class Zclinta0 {

        @Id @Column @Getter @Setter
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String CLINTANUM;

        @Column @Getter @Setter
        private int CLINTAETA;

        @Column @Getter @Setter
        private String CLINTATYP;

        @Column @Getter @Setter
        private double CLINTAPLA;

        @Column @Getter @Setter
        private String CLINTATYN;

        @Column @Getter @Setter
        private String CLINTASEQ;

        @Column @Getter @Setter
        private String CLINTANUT;

        @Column @Getter @Setter
        private String CLINTAOPT;

        @Column @Getter @Setter
        private int SABVERSION;

        @Column @Getter @Setter
        private String FILLER;

}


