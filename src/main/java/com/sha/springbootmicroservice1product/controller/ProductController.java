package com.sha.springbootmicroservice1product.controller;


import com.sha.springbootmicroservice1product.model.Product;
import com.sha.springbootmicroservice1product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/product") //pre-path
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @RequestMapping(method = RequestMethod.POST)// ->api/product
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(
                productService.saveProduct(product),
                HttpStatus.CREATED
        );
    }

    @RequestMapping(value = "/{productId}" , method = RequestMethod.DELETE)// -> api/product/{productId}
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId){
        productService.deleteProduct(productId);
        return new ResponseEntity<>(
                HttpStatus.OK
        );
    }

    @RequestMapping(method = RequestMethod.GET)// ->api/product
    public ResponseEntity<?> getAllProducts(){
        return ResponseEntity.ok(productService.findAllProducts());
    }

}
