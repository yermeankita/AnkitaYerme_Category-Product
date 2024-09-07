package com.ankita_yerme.Ankita_Yerme_product_Category.repository;

import com.ankita_yerme.Ankita_Yerme_product_Category.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
