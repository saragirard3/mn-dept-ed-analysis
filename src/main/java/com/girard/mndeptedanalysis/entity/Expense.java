package com.girard.mndeptedanalysis.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="expense")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fiscalYear;

    @ManyToOne
    @JoinColumn(name="district_id")
    private District districtId;

    private Long districtLevelAdmin;
    private Long schoolLevelAdmin;
    private Long regInstruct;
    private Long careerTechInstruct;
    private Long specialEd;
    private Long studentActivities;
    private Long instructSupportServices;
    private Long pupilSupportServices;
    private Long operationsMaintenance;
    private Long transportation;
    private Long equipment;
    private Long landBuildings;
    private Long totalGeneralFund;
    private Long totalFoodService;
    private Long totalCommunityService;
    private Long totalBuildingConstruction;
    private Long totalDebtService;
    private Long totalPostEmpDebtService;

    public Expense() {
    }

    public Expense(Integer id, String fiscalYear, District districtId, Long districtLevelAdmin, Long schoolLevelAdmin, Long regInstruct, Long careerTechInstruct, Long specialEd, Long studentActivities, Long instructSupportServices, Long pupilSupportServices, Long operationsMaintenance, Long transportation, Long equipment, Long landBuildings, Long totalGeneralFund, Long totalFoodService, Long totalCommunityService, Long totalBuildingConstruction, Long totalDebtService, Long totalPostEmpDebtService) {
        this.id = id;
        this.fiscalYear = fiscalYear;
        this.districtId = districtId;
        this.districtLevelAdmin = districtLevelAdmin;
        this.schoolLevelAdmin = schoolLevelAdmin;
        this.regInstruct = regInstruct;
        this.careerTechInstruct = careerTechInstruct;
        this.specialEd = specialEd;
        this.studentActivities = studentActivities;
        this.instructSupportServices = instructSupportServices;
        this.pupilSupportServices = pupilSupportServices;
        this.operationsMaintenance = operationsMaintenance;
        this.transportation = transportation;
        this.equipment = equipment;
        this.landBuildings = landBuildings;
        this.totalGeneralFund = totalGeneralFund;
        this.totalFoodService = totalFoodService;
        this.totalCommunityService = totalCommunityService;
        this.totalBuildingConstruction = totalBuildingConstruction;
        this.totalDebtService = totalDebtService;
        this.totalPostEmpDebtService = totalPostEmpDebtService;
    }
}
