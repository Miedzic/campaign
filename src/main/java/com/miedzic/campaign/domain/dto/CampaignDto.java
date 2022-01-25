package com.miedzic.campaign.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CampaignDto {

    private Long id;
    private String name;
    private Long productId;
    private Long townId;
 //   private List<String> keywords;
    @NotNull
    @Min(10)
    private Integer bidAmount;
    private Integer campaignFund;
    @NotNull
    private boolean status;
    @NotNull
    private Integer radius;
}
