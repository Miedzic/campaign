package com.miedzic.campaign.mapper;


import com.miedzic.campaign.domain.dao.Product;
import com.miedzic.campaign.domain.dto.ProductDto;
import org.mapstruct.Mapper;

//@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDto productToProductDto(Product product);

    Product productDtoToProduct(ProductDto productDto);
}
