package com.employers.claimsproclient.service;

import com.employers.claimsproclient.dao.model.Policy;
import com.employers.claimsproclient.dao.model.PolicyList;
import com.employers.claimsproclient.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {
    @Autowired
    private PolicyRepository policyRepository;

    public PolicyList getPolicies(){
        List<Policy> policies = policyRepository.getPolicies();
        PolicyList policyList = new PolicyList();
        policyList.setPolicies(policies);
        return policyList;
    }
}
