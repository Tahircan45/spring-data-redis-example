package com.barracuda.redis;

import com.barracuda.redis.entity.Product;
import com.barracuda.redis.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
public class SpringDataRedisExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringDataRedisExampleApplication.class, args);
	}

}
