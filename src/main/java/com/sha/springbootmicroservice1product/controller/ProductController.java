package com.sha.springbootmicroservice1product.controller;


import com.sha.springbootmicroservice1product.model.Product;
import com.sha.springbootmicroservice1product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product") //pre-path
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping   // ->api/product
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("{productId}")  // -> api/product/{productId}
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId){
        productService.deleteProduct(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping   // ->api/product
    public ResponseEntity<?> getAllProducts(){
        return ResponseEntity.ok(productService.findAllProducts());
    }

}
