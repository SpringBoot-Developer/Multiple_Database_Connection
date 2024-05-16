package com.multiple.db.postgres.repo;

import com.multiple.db.postgres.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}
