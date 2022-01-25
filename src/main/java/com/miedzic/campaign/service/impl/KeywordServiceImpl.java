package com.miedzic.campaign.service.impl;

import com.miedzic.campaign.domain.dao.Keyword;
import com.miedzic.campaign.repository.KeywordRepository;
import com.miedzic.campaign.service.KeywordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KeywordServiceImpl implements KeywordService {
    private final KeywordRepository keywordRepository;

    @Override
    public Keyword save(final Keyword keyword) {
        return null;
    }

    @Override
    public Keyword update(final Keyword keyword, final Long id) {
        return null;
    }

    @Override
    public void delete(final Keyword keyword) {

    }

    @Override
    public List<Keyword> findKeywords(List<String> keywords) {
        return keywordRepository.findByNameIn(keywords);
    }
}
