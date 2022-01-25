package com.miedzic.campaign.mapper;


import com.miedzic.campaign.domain.dao.Town;
import com.miedzic.campaign.domain.dto.TownDto;
import org.mapstruct.Mapper;

//@Mapper(componentModel = "spring")
public interface TownMapper {
    TownDto townToTownDto(Town town);

    Town townDtoToTown(TownDto townDto);
}
