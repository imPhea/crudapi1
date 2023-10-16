package com.app.demo.controller;

import com.app.demo.model.entity.CategoryEntity;
import com.app.demo.model.request.category.CategoryRequest;
import com.app.demo.model.response.category.CategoryResponse;
import com.app.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private CategoryService categoryService;
    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // post = create
    @PostMapping("/create")
    public ResponseEntity<CategoryResponse> create(
            @RequestBody CategoryRequest request
            ) {
        CategoryEntity category  = this.categoryService.create(request);
        return ResponseEntity.ok(CategoryResponse.fromEntity(category));
    }

}
