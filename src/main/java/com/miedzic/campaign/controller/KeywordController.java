package com.miedzic.campaign.controller;

import com.miedzic.campaign.domain.dto.KeywordDto;
import com.miedzic.campaign.mapper.KeywordMapper;
import com.miedzic.campaign.service.KeywordService;
import com.miedzic.campaign.validator.group.Create;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/keywords")
@RequiredArgsConstructor
@Validated
public class KeywordController {
    private final KeywordService keywordService;
    private final KeywordMapper keywordMapper;

    @GetMapping("/{id}")
    public KeywordDto getKeywordById(@PathVariable Long id) {
        return keywordMapper.keywordToKeywordDto(keywordService.getById(id));
    }

    @PostMapping
    @Validated(Create.class)
    public KeywordDto saveKeyword(@RequestBody @Valid KeywordDto keyword) {
        return keywordMapper.keywordToKeywordDto(keywordService.save(keywordMapper.keywordDtoToKeyword(keyword)));
    }

    @DeleteMapping("/{id}")
    public void deleteKeywordById(@PathVariable Long id) {
        keywordService.deleteById(id);
    }

    @PutMapping("/{id}")
    public KeywordDto updateProduct(@RequestBody KeywordDto keyword, @PathVariable Long id) {
        return keywordMapper.keywordToKeywordDto(keywordService.update(keywordMapper.keywordDtoToKeyword(keyword), id));
    }


}
