package com.barracuda.redis.repository;

import com.barracuda.redis.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductDao {
    public static final String HASH_KEY="Product";
    @Autowired
    private RedisTemplate template;
    public Product save(Product product){
        template.opsForHash().put(HASH_KEY,product.getId(),product);
        return product;
    }
    public List<Product> findAll(){
        return template.opsForHash().values(HASH_KEY);
    }
    public Object findProducyById(int id){
        System.out.println("findProducyById():Loaded From DB");
        return  template.opsForHash().get(HASH_KEY,id);
    }
    public String deleteProduct(int id){
        template.opsForHash().delete(HASH_KEY,id);
        return "Deleted";
    }

}
