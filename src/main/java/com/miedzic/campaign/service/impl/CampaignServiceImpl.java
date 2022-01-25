package com.miedzic.campaign.service.impl;

import com.miedzic.campaign.domain.dao.Campaign;
import com.miedzic.campaign.repository.CampaignRepository;
import com.miedzic.campaign.service.CampaignService;
import com.miedzic.campaign.service.KeywordService;
import com.miedzic.campaign.service.ProductService;
import com.miedzic.campaign.service.TownService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CampaignServiceImpl implements CampaignService {
    private final CampaignRepository campaignRepository;
    private final ProductService productService;
    private final TownService townService;
    private final KeywordService keywordService;

    @Override
    public Campaign save(final Campaign campaign, Long productId, Long townId/*, List<String> keywords*/) {
        campaign.setProduct(productService.getById(productId));
        campaign.setTown(townService.getById(townId));
      //  campaign.setKeywords(keywordService.findKeywords(keywords));

        return campaignRepository.save(campaign);
    }

    @Override
    public Campaign update(final Campaign campaign, final Long id, Long productId, Long townId) {
        Campaign campaignDb = campaignRepository.getById(id);

        campaignDb.setName(campaign.getName());
        campaignDb.setCampaignFund(campaign.getCampaignFund());
        campaignDb.setBidAmount(campaign.getBidAmount());
        campaignDb.setKeywords(campaign.getKeywords());
        campaignDb.setRadius(campaign.getRadius());
        campaignDb.setProduct(productService.getProductById(productId));
        campaignDb.setTown(townService.getById(townId));
        campaignDb.setStatus(campaign.isStatus());
        return campaignDb;
    }

    @Override
    public void deleteById(final Long id) {
        campaignRepository.deleteById(id);
    }

    @Override
    public Page<Campaign> getPage(final Pageable pageable) {
        return campaignRepository.findAll(pageable);
    }

    @Override
    public Campaign getById(final Long id) {
        return campaignRepository.getById(id);

    }

    @Override
    public List<Campaign> getAllProducts() {
        return campaignRepository.findAll();
    }


}
