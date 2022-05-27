package com.oracle.tech.challenge.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BuildRecord {

    @NotNull
    private Integer customerId;

    @NotNull
    private Integer contractId;

    @NotBlank
    private String geoZone;

    @NotBlank
    private String teamCode;

    @NotBlank
    private String projectCode;

    @NotBlank
    private String buildDuration;

    public BuildRecord(Integer customerId, Integer contractId, String geoZone, String teamCode, String projectCode, String buildDuration) {
        this.customerId = customerId;
        this.contractId = contractId;
        this.geoZone = geoZone;
        this.teamCode = teamCode;
        this.projectCode = projectCode;
        this.buildDuration = buildDuration;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getGeoZone() {
        return geoZone;
    }

    public void setGeoZone(String geoZone) {
        this.geoZone = geoZone;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getBuildDuration() {
        return buildDuration;
    }

    public void setBuildDuration(String buildDuration) {
        this.buildDuration = buildDuration;
    }

    @Override
    public String toString() {
        return "BuildRecord{" +
                "customerId=" + customerId +
                ", contractId=" + contractId +
                ", geoZone='" + geoZone + '\'' +
                ", teamCode='" + teamCode + '\'' +
                ", projectCode='" + projectCode + '\'' +
                ", buildDuration='" + buildDuration + '\'' +
                '}';
    }
}
