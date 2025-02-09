package com.productservice.service;

import com.productservice.converter.ProductConevrter;
import com.productservice.enity.Product;
import com.productservice.mdel.ProductRequest;
import com.productservice.repository.ProductRepository;
import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@Transactional
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    ProductConevrter productConevrter;
    public void save(ProductRequest productRequest){
        Product product=(productConevrter.convert(productRequest));

       productRepository.save(product);
          }

}
