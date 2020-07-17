package com.employers.claimsproclient.service;

import com.employers.claimsproclient.dao.model.Claim;
import com.employers.claimsproclient.dao.model.ClaimsInfoList;
import com.employers.claimsproclient.dto.model.ClaimDTO;
import com.employers.claimsproclient.mapper.ClaimMapper;
import com.employers.claimsproclient.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class ClaimsProService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private ClaimMapper mapper;


    public ClaimsInfoList getClaimsInfo(String policyNum){
        ClaimsInfoList claimsInfoList = restTemplate.getForObject( "/xyz/" + policyNum, ClaimsInfoList.class );
        return claimsInfoList;
    }

    public Optional<Claim> findByClaimId(String claimId){
        return claimRepository.findByClaimId( claimId );
    }

    public Claim saveClaimInfo(ClaimDTO dto){
        Claim claim = new Claim();
        mapper.updateClaimFromDto( dto,claim );
        claimRepository.save( claim );
        return claim;
    }

    public Claim updateClaimInfo(ClaimDTO dto){
        Optional<Claim> claimExisting = claimRepository.findByClaimId( dto.getClaimId() );
        if(claimExisting.isPresent()){
            Claim claim = claimExisting.get();
            mapper.updateClaimFromDto( dto,claim );
            claimRepository.save( claim );
            return claim;
        }
        return claimExisting.get();
    }
}
