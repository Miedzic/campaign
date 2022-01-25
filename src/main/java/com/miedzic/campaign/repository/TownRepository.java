package com.miedzic.campaign.repository;

import com.miedzic.campaign.domain.dao.Town;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TownRepository extends JpaRepository<Town, Long> {
}
