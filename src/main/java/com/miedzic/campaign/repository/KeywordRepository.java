package com.miedzic.campaign.repository;

import com.miedzic.campaign.domain.dao.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KeywordRepository extends JpaRepository<Keyword, Long> {
    List<Keyword> findByNameIn(List<String> keywords);
}
