package com.employers.claimsproclient.mapper;

import com.employers.claimsproclient.dao.model.Claim;
import com.employers.claimsproclient.dto.model.ClaimDTO;
import org.mapstruct.*;

@Mapper
public interface ClaimMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateClaimFromDto(ClaimDTO dto, @MappingTarget Claim entity);
}
