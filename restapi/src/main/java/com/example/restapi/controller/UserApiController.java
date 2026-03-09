package com.example.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.domain.User;
import com.example.restapi.dto.UserRequest;
import com.example.restapi.service.UserService;

import jakarta.validation.Valid;

/**
 * ユーザー情報を管理するREST APIコントローラー
 */
@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET,
    RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@Valid
public class UserApiController {

    private final UserService userService;

    @Autowired
    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    // パスパラメータを使ったGETメソッド（GET /users/{id}）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
       User user = userService.findById(id);
       return ResponseEntity.ok(user);
    }

    // クエリパラメータを使ったGETメソッド（GET /users/search）
    // 引数や戻り値は適宜修正してください
    @GetMapping("/search")
    public ResponseEntity<List<User>> searchUsers(@RequestParam(required = false) String name,
        @RequestParam(required = false) String email) {
        User searchCondition = new User();
        searchCondition.setName(name);
        searchCondition.setEmail(email);

        List<User> users = userService.searchUsers(searchCondition);
        return ResponseEntity.ok(users);
    }

    // POSTメソッドによるユーザー作成（POST /users）
    // 引数や戻り値は適宜修正してください
    @PostMapping("")
    public ResponseEntity<User> createUser(@Valid @RequestBody UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    // PUTメソッドによるユーザー更新（PUT /users/{id}）
    // 引数や戻り値は適宜修正してください
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @Valid @RequestBody UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());
        
        User updatedUser = userService.updateUser(id, user);
        return ResponseEntity.ok(updatedUser);
    }
}