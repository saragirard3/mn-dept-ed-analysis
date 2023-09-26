package com.girard.mndeptedanalysis.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "adm")
public class Adm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fiscalYear;

    @ManyToOne
    @JoinColumn(name="district_id")
    private District districtId;

    private Integer districtAdm;

    public Adm() {
    }

    public Adm(Integer id, String fiscalYear, District districtId, Integer districtAdm) {
        this.id = id;
        this.fiscalYear = fiscalYear;
        this.districtId = districtId;
        this.districtAdm = districtAdm;
    }
}
