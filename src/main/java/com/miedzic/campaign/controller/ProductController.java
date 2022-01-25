package com.miedzic.campaign.controller;

import com.miedzic.campaign.domain.dao.Product;
import com.miedzic.campaign.domain.dto.ProductDto;
import com.miedzic.campaign.mapper.ProductMapper;
import com.miedzic.campaign.service.ProductService;
import com.miedzic.campaign.validator.group.Create;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@Validated
public class ProductController {
    private final ProductService productService;
    private final ProductMapper productMapper;

    @GetMapping("/{id}")
    public ProductDto getProductById(@PathVariable Long id) {
        return productMapper.productToProductDto(productService.getProductById(id));
    }

    @PostMapping
    @Validated(Create.class)
    public ProductDto saveProduct(@RequestBody @Valid ProductDto product) {
        return productMapper.productToProductDto(productService.save(productMapper.productDtoToProduct(product)));
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.deleteById(id);
    }

    @PutMapping("/{id}")
    public ProductDto updateProduct(@RequestBody ProductDto product, @PathVariable Long id) {
        return productMapper.productToProductDto(productService.update(productMapper.productDtoToProduct(product), id));
    }

    @GetMapping
    public Page<Product> getProductPage(@RequestParam int page, @RequestParam int size) {
        return productService.getPage(PageRequest.of(page, size));
    }
}
