package vau.ac.lk.firstapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vau.ac.lk.firstapp.model.Product;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

   // int [] product = new int[5];

   private List <Product> Products= new ArrayList<>();



  @PostMapping("/postProduct")
  //public -- access modifier
    public  String postProduct(@RequestBody Product product1)   //send json data type
  {
      Products.add(product1);
      return  " Successfully Added...!";
  }


}
