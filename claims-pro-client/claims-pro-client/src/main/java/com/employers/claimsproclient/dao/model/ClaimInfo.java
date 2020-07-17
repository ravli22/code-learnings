package com.employers.claimsproclient.dao.model;

import java.time.LocalDateTime;

public class ClaimInfo {
    private String policyNumber;
    private String claimNumber;
    private String claimantName;
    private String classCode;
    private LocalDateTime dateOfInjury;
    private String accidentState;
    private String accidentDescription;
    private Integer totalIncurred;

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getClaimantName() {
        return claimantName;
    }

    public void setClaimantName(String claimantName) {
        this.claimantName = claimantName;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public LocalDateTime getDateOfInjury() {
        return dateOfInjury;
    }

    public void setDateOfInjury(LocalDateTime dateOfInjury) {
        this.dateOfInjury = dateOfInjury;
    }

    public String getAccidentState() {
        return accidentState;
    }

    public void setAccidentState(String accidentState) {
        this.accidentState = accidentState;
    }

    public String getAccidentDescription() {
        return accidentDescription;
    }

    public void setAccidentDescription(String accidentDescription) {
        this.accidentDescription = accidentDescription;
    }

    public Integer getTotalIncurred() {
        return totalIncurred;
    }

    public void setTotalIncurred(Integer totalIncurred) {
        this.totalIncurred = totalIncurred;
    }
}
