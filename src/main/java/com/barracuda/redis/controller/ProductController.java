package com.barracuda.redis.controller;

import com.barracuda.redis.entity.Product;
import com.barracuda.redis.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductDao dao;
    @PostMapping
    public Product save(@RequestBody Product product){
        return dao.save(product);
    }
    @GetMapping
    public List<Product> getAllProduct(){
        return dao.findAll();
    }
    @GetMapping("/{id}")
    public Product findProduct(@PathVariable int id){
        return dao.findProducyById(id);
    }
    @DeleteMapping("/{id}")
    public String  deleteProduct(@PathVariable int id){
        return dao.deleteProduct(id);
    }
}