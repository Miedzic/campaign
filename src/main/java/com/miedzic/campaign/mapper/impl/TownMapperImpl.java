/*
package com.miedzic.campaign.mapper.impl;

import com.miedzic.campaign.domain.dao.Town;
import com.miedzic.campaign.domain.dto.TownDto;
import com.miedzic.campaign.mapper.TownMapper;
import org.springframework.stereotype.Component;

@Component
public class TownMapperImpl implements TownMapper {
    @Override
    public TownDto townToTownDto(final Town town) {
        return TownDto.builder()
                .id(town.getId())
                .name(town.getName())
                .build();
    }

    @Override
    public Town townDtoToTown(final TownDto town) {
        return Town.builder()
                .id(town.getId())
                .name(town.getName())
                .build();
    }
}
*/
