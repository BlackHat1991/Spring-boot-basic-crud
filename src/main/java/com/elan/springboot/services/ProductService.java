package com.elan.springboot.services;

import java.util.List;

import com.elan.springboot.VO.ProductForm;
import com.elan.springboot.domain.Product;


public interface ProductService {

    List<Product> listAll();

    Product getById(Long id);

    Product saveOrUpdate(Product product);

    void delete(Long id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
