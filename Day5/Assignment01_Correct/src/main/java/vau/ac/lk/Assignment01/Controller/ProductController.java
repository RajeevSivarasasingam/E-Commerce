/*
package vau.ac.lk.Assignment01.Controller;


public class ProductController {
}
*/

package vau.ac.lk.Assignment01.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import vau.ac.lk.Assignment01.model.Product;
import vau.ac.lk.Assignment01.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    // Add Product
    @PostMapping("/products")
    public String addProduct(@RequestBody Product product){
        return productService.addProductService(product);
    }

    // Get All Products
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProductsService();
    }

    // Delete Product by ID
    @DeleteMapping("/products/{id}")
    public String deleteProductById(@PathVariable int id){
        return productService.deleteProductByIdService(id);
    }

    // Delete All Products
    @DeleteMapping("/products/all")
    public String deleteAllProducts(){
        return productService.deleteAllProductsService();
    }

}