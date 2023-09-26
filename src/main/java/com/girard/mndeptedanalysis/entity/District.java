package com.girard.mndeptedanalysis.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "district")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer districtNumber;
    private String districtName;

    public District() {
    }

    public District(Integer id, Integer districtNumber, String districtName) {
        this.id = id;
        this.districtNumber = districtNumber;
        this.districtName = districtName;
    }
}
