package com.employers.claimsproclient.repository;

import com.employers.claimsproclient.dao.model.Claim;
import com.employers.claimsproclient.dao.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface ClaimRepository extends JpaRepository<Claim, String> {
   // @Query(value = "update cl_claim set ")
    void updateClaimInfo();

    Optional<Claim> findByClaimId(String claimId);

}