package com.miedzic.campaign.service;

import com.miedzic.campaign.domain.dao.Campaign;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CampaignService {
    Campaign save(Campaign campaign, Long productId, Long townId, List<String> keywords);

    Campaign update(Campaign campaign, Long id, Long productId, Long townId,List<String> keywords);

    void deleteById(Long id);

    Page<Campaign> getPage(Pageable pageable);

    Campaign getById(Long id);

   List<Campaign> getAllProducts();

}
