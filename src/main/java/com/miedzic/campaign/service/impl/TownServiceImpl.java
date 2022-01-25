package com.miedzic.campaign.service.impl;

import com.miedzic.campaign.domain.dao.Town;
import com.miedzic.campaign.repository.TownRepository;
import com.miedzic.campaign.service.TownService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TownServiceImpl implements TownService {
    private final TownRepository townRepository;

    @Override
    public Town save(final Town town) {

        return townRepository.save(town);
    }

    @Override
    public Town update(final Town town, final Long id) {
        Town townDb = getById(id);
        townDb.setName(town.getName());
        return townDb;
    }

    @Override
    public void deleteById(final Long id) {
        townRepository.deleteById(id);
    }

    @Override
    public Town getById(final Long id) {
        return townRepository.getById(id);
    }

    @Override
    public Page<Town> getPage(final Pageable pageable) {
        return townRepository.findAll(pageable);
    }


}
