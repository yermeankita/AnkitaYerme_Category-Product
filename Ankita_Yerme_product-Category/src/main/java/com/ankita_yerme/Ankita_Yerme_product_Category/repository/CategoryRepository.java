package com.ankita_yerme.Ankita_Yerme_product_Category.repository;

import com.ankita_yerme.Ankita_Yerme_product_Category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {
}
