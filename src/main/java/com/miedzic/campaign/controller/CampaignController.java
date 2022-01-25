package com.miedzic.campaign.controller;


import com.miedzic.campaign.domain.dao.Campaign;
import com.miedzic.campaign.domain.dao.Keyword;
import com.miedzic.campaign.domain.dao.Product;
import com.miedzic.campaign.domain.dto.CampaignDto;
import com.miedzic.campaign.domain.dto.ProductDto;
import com.miedzic.campaign.mapper.CampaignMapper;
import com.miedzic.campaign.service.CampaignService;
import com.miedzic.campaign.validator.group.Create;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/campaigns")
@RequiredArgsConstructor
@Validated

public class CampaignController {
    private final CampaignService campaignService;
    private final CampaignMapper campaignMapper;

    @GetMapping("/{id}")
    public CampaignDto getCampaignById(@PathVariable Long id) {
        return campaignMapper.campaignToCampaignDto(campaignService.getById(id));
    }

    @PostMapping
    @Validated(Create.class)
    public CampaignDto saveCampaign(@RequestBody @Valid CampaignDto campaign) {
        return campaignMapper.campaignToCampaignDto(campaignService.save(campaignMapper.campaignDtoToCampaign(campaign), campaign.getProductId(), campaign.getTownId()));
    }
    @DeleteMapping("/{id}")
    public void deleteCampaignById(@PathVariable Long id) {
        campaignService.deleteById(id);
    }

    @PutMapping("/{id}")
    public CampaignDto updateCampaign(@RequestBody CampaignDto campaign, @PathVariable Long id) {
        return campaignMapper.campaignToCampaignDto(campaignService.update(campaignMapper.campaignDtoToCampaign(campaign),id, campaign.getProductId(), campaign.getTownId()));
    }

    @GetMapping
    public Page<Campaign> getCampaignPage(@RequestParam int page, @RequestParam int size) {
        return campaignService.getPage(PageRequest.of(page, size));
    }
    @GetMapping("/all")
    public List<Campaign> getCampaignProducts() {
        return campaignService.getAllProducts();
    }

}
