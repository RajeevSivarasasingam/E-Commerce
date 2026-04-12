package vau.ac.lk.firstapp.service;

import org.springframework.stereotype.Service;
import vau.ac.lk.firstapp.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    // Add product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Get all products
    public List<Product> getAllProducts() {
        return products;
    }


}
