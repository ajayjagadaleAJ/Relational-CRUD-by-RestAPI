package com.data.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.data.Model.Product;
import com.data.Repository.ProductRepository;
import com.data.Service.ProductService;

@Service
public class ProductDao implements ProductService {

    @Autowired 
    ProductRepository pr;

    @Override
    public void register(Product p1) {
        pr.save(p1);
    }

    @Override
    public Page<Product> getAllInfo(Pageable pageable) {
        return pr.findAll(pageable); // Updated to return Page<Product>
    }

    @Override
    public Product geCategorybyId(long id) {
        return pr.findById(id).orElse(null);
    }

    @Override
    public void deleteCategorybyId(long id) {
        pr.deleteById(id);
    }

    @Override
    public Product updateSingleCategory(Product product, long id) {
        Product existingProduct = pr.findById(id).orElse(null);
        if (existingProduct != null) {
            if (product.getName() != null) existingProduct.setName(product.getName());
            if (product.getCategory() != null) existingProduct.setCategory(product.getCategory());
            pr.save(existingProduct);
        }
        return existingProduct;
    }
}
