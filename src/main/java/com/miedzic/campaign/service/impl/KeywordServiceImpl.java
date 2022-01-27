package com.miedzic.campaign.service.impl;

import com.miedzic.campaign.domain.dao.Keyword;
import com.miedzic.campaign.domain.dao.Product;
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
        return keywordRepository.save(keyword);
    }

    @Override
    public Keyword update(final Keyword keyword, final Long id) {
        Keyword keywordDb = getById(id);
        keywordDb.setName(keyword.getName());
        keywordRepository.save(keywordDb);
        return keywordDb;
    }

    @Override
    public void deleteById(final Long id) {
        keywordRepository.deleteById(id);
    }
    @Override
    public Keyword getById(final Long id) {
        return keywordRepository.getById(id);
    }
    @Override
    public List<Keyword> findKeywords(List<String> keywords) {
        return keywordRepository.findByNameIn(keywords);
    }
}
