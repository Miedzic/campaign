package com.miedzic.campaign.repository;

import com.miedzic.campaign.domain.dao.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
