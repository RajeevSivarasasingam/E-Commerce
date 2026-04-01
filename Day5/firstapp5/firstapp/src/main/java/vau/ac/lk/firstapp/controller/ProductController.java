package vau.ac.lk.firstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vau.ac.lk.firstapp.model.Product;
import vau.ac.lk.firstapp.service.ProductService;

import java.util.List;

@RestController
//@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    // Constructor injection
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Add a product
    @PostMapping("/postproduct")                    //http://localhost:8080/postproduct
    public String postProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "Successfully Added!";
    }

    // Get all products
    @GetMapping("/get")                     //http://localhost:8080/get
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
//delete all

// delete specific data



}