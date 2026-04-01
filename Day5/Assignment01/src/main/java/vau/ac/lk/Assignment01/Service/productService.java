package vau.ac.lk.Assignment01.Service;

import vau.ac.lk.Assignment01.model.product;

import java.util.ArrayList;
import java.util.List;

public class productService {

    private List<product> products = new ArrayList<>();

    //get all
    public String getAllProducts(product Product) {
        return products;
    }

    //Add product

    public String addProducts(product product) {
        products.add(product);
        return"Successfully Added....";
    }
}
