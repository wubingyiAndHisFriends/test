package com.service;

import com.intf.service.MainServiceIntface;
import com.product.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService implements MainServiceIntface {

    @Override
    public List<Product> findList() {
        System.out.println("find product list");
        return null;
    }

    @Override
    public Product findProduct() {
        System.out.println("find product");
        return null;
    }
}
