package com.girard.mndeptedanalysis.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="revenue")
public class Revenue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fiscalYear;

    @ManyToOne
    @JoinColumn(name="district_id")
    private District districtId;

    private Long propertyTaxLocal;
    private Long ptShiftLocal;
    private Long otherLocal;
    private Long genEdAidState;
    private Long specEdAidState;
    private Long otherState;
    private Long ptShiftState;
    private Long federalGenFund;
    private Long foodService;
    private Long communityService;
    private Long buildingConstruction;
    private Long debtService;
    private Long postEmployDebtService;
    private Long totalPropertyTaxLocal;
    private Long totalPtShiftLocal;
    private Long totalOtherLocal;
    private Long totalState;
    private Long totalPtShiftState;
    private Long totalFederal;

    public Revenue() {
    }

    public Revenue(Integer id, String fiscalYear, District districtId, Long propertyTaxLocal, Long ptShiftLocal, Long otherLocal, Long genEdAidState, Long specEdAidState, Long otherState, Long ptShiftState, Long federalGenFund, Long foodService, Long communityService, Long buildingConstruction, Long debtService, Long postEmployDebtService, Long totalPropertyTaxLocal, Long totalPtShiftLocal, Long totalOtherLocal, Long totalState, Long totalPtShiftState, Long totalFederal) {
        this.id = id;
        this.fiscalYear = fiscalYear;
        this.districtId = districtId;
        this.propertyTaxLocal = propertyTaxLocal;
        this.ptShiftLocal = ptShiftLocal;
        this.otherLocal = otherLocal;
        this.genEdAidState = genEdAidState;
        this.specEdAidState = specEdAidState;
        this.otherState = otherState;
        this.ptShiftState = ptShiftState;
        this.federalGenFund = federalGenFund;
        this.foodService = foodService;
        this.communityService = communityService;
        this.buildingConstruction = buildingConstruction;
        this.debtService = debtService;
        this.postEmployDebtService = postEmployDebtService;
        this.totalPropertyTaxLocal = totalPropertyTaxLocal;
        this.totalPtShiftLocal = totalPtShiftLocal;
        this.totalOtherLocal = totalOtherLocal;
        this.totalState = totalState;
        this.totalPtShiftState = totalPtShiftState;
        this.totalFederal = totalFederal;
    }
}
