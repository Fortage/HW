package com.example.marketplace.productDAO;

import com.example.marketplace.model.Product;
import com.example.marketplace.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductDAO {
    private static int PEOPLE_COUNT;
    private List<Product> products;

    @Autowired
    private ProductRepository productRepository;

    public List<Product> index() {
        return productRepository.findAll();
    }

    public Product show(int id) {
        return productRepository.findById((long) id).get();
        //return products.stream().filter(product -> product.getId() == id).findAny().orElse(null);
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public void update(int id, Product updatedProduct) {
        Product productToBeUpdated = show(id);

        productToBeUpdated.setName(updatedProduct.getName());
        productToBeUpdated.setCost(updatedProduct.getCost());
        save(productToBeUpdated);
    }

    public void delete(int id) {
        productRepository.deleteById((long) id);
    }
}
