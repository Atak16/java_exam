package com.example.restapi.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

// Request用DTOクラスの作成
public class UserRequest {
    private Integer id;

    @NotBlank(message = "名前は必須入力です")
    private String name;

    @NotBlank(message = "メールアドレスは必須入力です")
    @Email(message = "有効なメールアドレスを入力してください")
    private String email;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    // 引数なしコンストラクタ
    public UserRequest() {
    }

    // 引数ありコンストラクタ
    public UserRequest(Integer id, String name, String email, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    //getter and setter
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
        return "UserRequest [id=" + id + ", name=" + name + ", email=" + email + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + "]";
    }
}