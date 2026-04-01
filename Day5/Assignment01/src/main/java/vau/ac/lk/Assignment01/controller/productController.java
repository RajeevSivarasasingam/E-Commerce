package vau.ac.lk.Assignment01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vau.ac.lk.Assignment01.Service.productService;
import vau.ac.lk.Assignment01.model.product;

import java.util.List;

@RestController
@RequestMapping("/products")
public class productController {

    private final productService productService;

    @Autowired
    public productController(productService ProductService) {
        this.productService = ProductService;
    }


    @PostMapping("/post")
    public String postProduct(@RequestBody product product) {

        productService.addProducts(product);
        return "Successfully Added...";
    }

    @GetMapping("/get")
    public List<product> getAllProducts() {
        return productService.getAllProducts();
    }

}