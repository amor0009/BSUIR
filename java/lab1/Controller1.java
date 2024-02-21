package com.example.test.Controller;

import com.example.test.model.User;
import com.example.test.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/test")
@AllArgsConstructor
public class Controller1 {

    private final UserService service;

    @GetMapping
    public List<User> findAllUsers() {
        return service.findAllUsers();
    }
    @PostMapping("save_user")
    public String saveUser(@RequestBody User user) {
        service.saveUser(user);
        return "The student is saved!";
    }
    @GetMapping("/{nameOfAccount}")
    public User findUserByNameOfAccount(@PathVariable String nameOfAccount) {
        return service.findUserByNameOfAccount(nameOfAccount);
    }
    @PutMapping("update_user")
    public String updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }
    @DeleteMapping("delete_user/{nameOfAccount }")
    public String deleteUser(@PathVariable String nameOfAccount) {
        return service.deleteUser(nameOfAccount);
    }
}
