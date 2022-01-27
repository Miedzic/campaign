package com.miedzic.campaign.mapper;

import com.miedzic.campaign.domain.dao.Keyword;
import com.miedzic.campaign.domain.dao.Product;
import com.miedzic.campaign.domain.dto.KeywordDto;
import com.miedzic.campaign.domain.dto.ProductDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface KeywordMapper {
    KeywordDto keywordToKeywordDto(Keyword keyword);

    Keyword keywordDtoToKeyword(KeywordDto keywordDto);
}
