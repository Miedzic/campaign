package com.miedzic.campaign.service;

import com.miedzic.campaign.domain.dao.Town;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TownService {
    Town save(Town town);

    Town update(Town town, Long id);

    void deleteById(Long id);

    Town getById(Long id);

    //pageable
    Page<Town> getPage(Pageable pageable);
}
