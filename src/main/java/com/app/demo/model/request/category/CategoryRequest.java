package com.app.demo.model.request.category;

import com.app.demo.model.entity.CategoryEntity;

import java.io.Serializable;

public class CategoryRequest implements Serializable {
    private String username;
    private String gmail;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public CategoryEntity toEntity () {
        CategoryEntity category = new CategoryEntity();
        category.setUsername(this.username);
        category.setGmail(this.gmail);
        return category;
    }
}
