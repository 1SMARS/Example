package com.example.webfinal.Repo;

import com.example.webfinal.Entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface productRepo extends CrudRepository<Product, Long> {
    public List<Product> findAllByTypesAndSex(String type,String sex);
}
