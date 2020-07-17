package com.employers.claimsproclient.controller;

import com.employers.claimsproclient.dao.model.Claim;
import com.employers.claimsproclient.dao.model.Policy;
import com.employers.claimsproclient.dao.model.PolicyList;
import com.employers.claimsproclient.dto.model.ClaimsProResponseDTO;
import com.employers.claimsproclient.dao.model.ClaimsInfoList;
import com.employers.claimsproclient.service.ClaimsProService;
import com.employers.claimsproclient.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ClaimsProController {

    @Autowired
    private PolicyService policyService;

    @Autowired
    private ClaimsProService claimsProService;

    @GetMapping("/policies")
    public PolicyList getPolicies(){
        return policyService.getPolicies();
    }


    @PutMapping("/update/claims-pro-info/{policyNum}")
    public Object updateClaimInfo(@PathVariable String policyNum){
        ClaimsProResponseDTO claimsProResponse = new ClaimsProResponseDTO();
        try {
            ClaimsInfoList claimsInfo = claimsProService.getClaimsInfo( policyNum );
            //pass this info to the service update the table
            claimsInfo.getClaimInfoList().stream().
                    forEach(claim ->{
                        Optional<Claim> byClaimId = claimsProService.findByClaimId( claim.getClaimId() );
                        if(byClaimId.isPresent()){
                            Claim claim1 = claimsProService.updateClaimInfo( claim );
                            if(claim1!=null) {
                                claimsProResponse.setMsg( "claims info updated successfully!" );
                            }
                        }
                        else{
                            Claim saveClaimInfo = claimsProService.saveClaimInfo( claim );
                            if(saveClaimInfo!=null) {
                                claimsProResponse.setMsg( "claims info updated successfully!" );
                            }
                        }
                    });
        }catch (Exception e){
            claimsProResponse.setMsg("Error while updating the info!");
        }
        return claimsProResponse;
    }
}
