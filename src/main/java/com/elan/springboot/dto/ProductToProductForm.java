package com.elan.springboot.dto;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.elan.springboot.VO.ProductForm;
import com.elan.springboot.domain.Product;


@Component
public class ProductToProductForm implements Converter<Product, ProductForm> {
	
    @Override
    public ProductForm convert(Product product) {
        ProductForm productForm = new ProductForm();
        
        productForm.setId(product.getId());
        productForm.setDescription(product.getDescription());
        productForm.setImage(product.getImage());
        
        return productForm;
    }
}
