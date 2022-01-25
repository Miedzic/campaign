/*
package com.miedzic.campaign.mapper.impl;

import com.miedzic.campaign.domain.dao.Campaign;
import com.miedzic.campaign.domain.dto.CampaignDto;
import com.miedzic.campaign.mapper.CampaignMapper;
import org.springframework.stereotype.Component;

@Component
public class CampaignMapperImpl implements CampaignMapper {
    public CampaignDto campaignToCampaignDto(Campaign campaign) {
        return CampaignDto.builder()
                .id(campaign.getId())
                .name(campaign.getName())
                .campaignFund(campaign.getCampaignFund())
                .bidAmount(campaign.getBidAmount())
                .status(campaign.isStatus())
                .radius(campaign.getRadius())
                .build();
    }

    @Override
    public Campaign campaignDtoToCampaign( CampaignDto campaign) {
        return Campaign.builder()
                .id(campaign.getId())
                .name(campaign.getName())
                .campaignFund(campaign.getCampaignFund())
                .bidAmount(campaign.getBidAmount())
                .status(campaign.isStatus())
                .radius(campaign.getRadius())
                .build();
    }

}
*/
