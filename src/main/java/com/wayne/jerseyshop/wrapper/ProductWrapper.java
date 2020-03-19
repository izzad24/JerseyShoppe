package com.wayne.jerseyshop.wrapper;
import java.util.List;

import com.wayne.jerseyshop.entity.Product;

/**
 * ProductWrapper
 */
public class ProductWrapper {

    private List<Product> products;

    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}