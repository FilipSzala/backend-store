package com.example.fullstack_backend.model.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryNameAndBrand(String name, String brand);

    List<Product> findByCategoryName(String name);

    List<Product> findByBrandAndName(String brand, String name);

    List<Product> findByBrand(String brand);

    @Query("SELECT p FROM Product p WHERE LOWER(p.name) LIKE LOWER (Concat('%',:name,'%'))")
    List<Product> findByName(String name);

    boolean existsByNameAndBrand(String name, String brand);


}
