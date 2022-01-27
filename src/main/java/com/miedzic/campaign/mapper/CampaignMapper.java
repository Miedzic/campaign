package com.miedzic.campaign.mapper;

import com.miedzic.campaign.domain.dao.Campaign;
import com.miedzic.campaign.domain.dao.Keyword;
import com.miedzic.campaign.domain.dto.CampaignDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface CampaignMapper {
    @Mapping(source = "town.name", target = "townName")
    @Mapping(source = "product.name",target = "productName")
    CampaignDto campaignToCampaignDto(Campaign campaign);
    @Mapping(target = "keywords",ignore = true)
    Campaign campaignDtoToCampaign(CampaignDto campaignDto);

    default List<String> keywordToKeywordDto(List<Keyword> keyword) {
        return keyword.stream().map(Keyword::getName).collect(Collectors.toList());
    }

}
