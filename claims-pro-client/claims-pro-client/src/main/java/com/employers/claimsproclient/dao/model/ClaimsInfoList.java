package com.employers.claimsproclient.dao.model;

import com.employers.claimsproclient.dto.model.ClaimDTO;

import java.util.List;

public class ClaimsInfoList {
    private List<ClaimDTO> claimInfoList;

    public List<ClaimDTO> getClaimInfoList() {
        return claimInfoList;
    }

    public void setClaimInfoList(List<ClaimDTO> claimInfoList) {
        this.claimInfoList = claimInfoList;
    }
}
