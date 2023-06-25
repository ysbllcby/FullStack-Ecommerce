package com.ecommerceproject.ecommerce.dao;

import com.ecommerceproject.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
