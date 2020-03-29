package com.example.codeengine.demo.repository;

import com.example.codeengine.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Stepan Novikov
 */
public interface CategoryRepository extends JpaRepository<Category, Long > {
    Category findByName(String name);
}
