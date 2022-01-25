package com.miedzic.campaign.mapper;

import com.miedzic.campaign.domain.dao.Campaign;
import com.miedzic.campaign.domain.dao.Keyword;
import com.miedzic.campaign.domain.dto.CampaignDto;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface CampaignMapper {
    CampaignDto campaignToCampaignDto(Campaign campaign);

    Campaign campaignDtoToCampaign(CampaignDto campaignDto);

    default List<String> keywordToKeywordDto(List<Keyword> keyword) {
        return keyword.stream().map(Keyword::getName).collect(Collectors.toList());
    }

    default List<Keyword> keywordDtoToKeyword(List<String> list) {
        return list.stream().map(kw -> new Keyword()).collect(Collectors.toList());
    }
}
