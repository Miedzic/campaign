package com.miedzic.campaign.mapper.impl;

import com.miedzic.campaign.domain.dao.Product;
import com.miedzic.campaign.domain.dto.ProductDto;
import com.miedzic.campaign.mapper.ProductMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductMapperImpl implements ProductMapper {
    @Override
    public ProductDto productToProductDto(final Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .build();
    }

    @Override
    public Product productDtoToProduct(final ProductDto product) {
        return Product.builder()
                .id(product.getId())
                .name(product.getName())
                .build();
    }
}
