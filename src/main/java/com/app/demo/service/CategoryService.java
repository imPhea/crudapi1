package com.app.demo.service;

import com.app.demo.model.entity.CategoryEntity;
import com.app.demo.model.request.category.CategoryRequest;
import com.app.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    // extend one for use all in class
    private final CategoryRepository categoryRepository;

    @Autowired // use for know is injection jol
    public CategoryService(CategoryRepository _categoryRepository) {
        this.categoryRepository = _categoryRepository;
    }

    public CategoryEntity create(CategoryRequest request) {
        return this.categoryRepository.save(request.toEntity());
    }

}
