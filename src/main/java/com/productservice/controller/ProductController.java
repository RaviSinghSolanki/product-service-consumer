package com.productservice.controller;

import com.productservice.converter.ProductConevrter;
import com.productservice.enity.Product;
import com.productservice.mdel.ProductRequest;
import com.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/product")
@Log4j2
public class ProductController {
    @Autowired
    ProductService productService;

    @PutMapping
   public ResponseEntity<String> post(@RequestBody ProductRequest productRequest){
        productService.save(productRequest);
        return new ResponseEntity<String>("updated",HttpStatus.CREATED);
    }


}
