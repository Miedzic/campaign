package com.miedzic.campaign.service;

import com.miedzic.campaign.domain.dao.Keyword;

import java.util.List;

public interface KeywordService {
    Keyword save(Keyword keyword);

    Keyword update(Keyword keyword, Long id);

    void delete(Keyword keyword);

    List<Keyword> findKeywords(List<String> keywords);
}
