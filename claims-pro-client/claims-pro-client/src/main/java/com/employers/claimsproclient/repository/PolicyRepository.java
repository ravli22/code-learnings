package com.employers.claimsproclient.repository;

import com.employers.claimsproclient.dao.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, String> {

    @Query(value = "select policy_no from va_import_main_stg where batch_id=:batch_id", nativeQuery = true)
    List<Policy> getPolicies();
}
