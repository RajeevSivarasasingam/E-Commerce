
package vau.ac.lk.Assignment01.service;

import org.springframework.stereotype.Service;
import vau.ac.lk.Assignment01.model.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    // Add Product
    public String addProductService(Product product){

        if(product.getQuantity() <= 0){
            return "Quantity must be greater than zero";
        }

        products.add(product);
        return "The product is Successfully Added in the list.";
    }

    // Get All Products
    public List<Product> getAllProductsService(){
        return products;
    }

    // Delete Product by ID
    public String deleteProductByIdService(int id){

        for(Product p : products){
            if(p.getId() == id){
                products.remove(p);
                return "Product id " + id + " is successfully deleted.";
            }
        }

        return "Product not found";
    }

    // Delete All Products
    public String deleteAllProductsService(){
        products.clear();
        return "All Products successfully deleted.";
    }

}