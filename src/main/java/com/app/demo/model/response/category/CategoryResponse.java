package com.app.demo.model.response.category;

import com.app.demo.model.entity.CategoryEntity;

import java.io.Serializable;

// imp serialize use for convert to bytestream in network(api)
public class CategoryResponse implements Serializable {
    private Long id;
    private String username;
    private String gmail;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getGmail() {
        return gmail;
    }

    // constructor
    public CategoryResponse(Long _id, String _username, String _gmail) {
        this.id = _id;
        this.username = _username;
        this.gmail = _gmail;
    }

    public static CategoryResponse fromEntity(CategoryEntity entity) {
        return new CategoryResponse(
                entity.getId(),
                entity.getUsername(),
                entity.getGmail()
            );
        }
}
