package com.klymenko.foodapp.category.repository;

import com.klymenko.foodapp.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
