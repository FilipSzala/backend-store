package com.example.fullstack_backend.model.product;

import com.example.fullstack_backend.model.product.dtoRequest.AddProductRequest;
import com.example.fullstack_backend.model.product.dtoRequest.UpdateProductRequest;
import com.example.fullstack_backend.model.product.dtoRespone.ProductDto;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);

    Product updateInventoryInProduct(UpdateProductRequest product, Long productId);

    Product getProductById(Long productId);


    Product updateInventoryInProduct(Product product, int quantity);

    void deleteProductById(Long productId);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByCategoryAndBrand(String category, String brand);

    List<Product> getProductsByBrandAndName(String brand, String name);

    List<Product> getProductsByName(String name);

    List<Product> getDisctinctProductsByName();

    List<Product> getProductsByBrand(String brand);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
}
