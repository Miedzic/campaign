package com.miedzic.campaign.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeywordDto {
    private Long id;
    @NotBlank
    private String name;
}
