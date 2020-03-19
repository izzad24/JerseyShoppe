package com.wayne.jerseyshop.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.wayne.jerseyshop.entity.Product;
import com.wayne.jerseyshop.repositories.ProductRepository;
import com.wayne.jerseyshop.wrapper.ProductWrapper;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * ProductController
 */
@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepo;

    @GetMapping(value="/products")
    public List<Product> productList() {
        
        return productRepo.findAll();
    }

    // @PostMapping(value = "/products")
    // public List<Product> updateProduct(@RequestBody ProductWrapper products){

    //     for (Product product : products.getProducts()) {
            
    //         productList.get(product.getId().intValue()-1).setMaxQty(product.getMaxQty() - product.getQty());
    //     }
    //     return productList;
    // }
    
    // Product createProduct(){
    //     Product product = new Product();
    //     Random r = new Random();
    //     product.setProductName("Jersey" + r.nextInt(10));
    //     product.setImageUrl("https://d2lhrgc5rek5ye.cloudfront.net/pub/media/catalog/product/cache/74c1057f7991b4edb2bc7bdaa94de933/m/t/mt930001-hme_image.jpg");
    //     product.setQty(1);
    //     product.setMaxQty(10);
    //     product.setPrice(99);
    //     product.setTotalPrice(99);
    //     product.setDetails("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed id tellus nisl. Phasellus vulputate fringilla purus, quis sagittis purus rutrum fermentum. Etiam scelerisque arcu at convallis lacinia. Curabitur vestibulum enim leo, id luctus magna rutrum quis.");

    //     return product;
    // }

    // void seedProduct(){
    //     for(Long id = 1; id < 11; id++){
    //         Product product = createProduct();
    //         product.setId(id);
    //         productList.add(product);
    //     }
    // }
}