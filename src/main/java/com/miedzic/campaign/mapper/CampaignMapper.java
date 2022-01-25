package com.miedzic.campaign.mapper;

import com.miedzic.campaign.domain.dao.Campaign;
import com.miedzic.campaign.domain.dao.Keyword;
import com.miedzic.campaign.domain.dto.CampaignDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CampaignMapper {
    CampaignDto campaigntoCampaignDto(Campaign campaign);

    Campaign campaignDtoToCampaign(CampaignDto campaignDto);

}
