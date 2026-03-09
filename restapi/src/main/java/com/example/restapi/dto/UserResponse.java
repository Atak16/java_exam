package com.example.restapi.dto;

import java.time.LocalDateTime;

// Response用DTOクラスの作成
public class UserResponse {
    private Integer id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // デフォルトコンストラクタ
    public UserResponse() {
    }

    // 全てのフィールドを受け取るコンストラクタ
    public UserResponse(Integer id, String name, String email, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getter and Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // toStringメソッド
    @Override
    public String toString() {
        return "UserResponse [id=" + id + ", name=" + name + ", email=" + email + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + "]";
    }

}
