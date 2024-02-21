package com.example.test.repository;

import com.example.test.model.User;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryUserDAO {
    private final List<User> USERS = new ArrayList<>();
    public List<User> findAllUsers() {
        return USERS;
    }
    public String saveUser(User user) {
        USERS.add(user);
        return "The User is successfully saved";
    }
    public String updateUser(User user) {
        var userIndex = IntStream.range(0, USERS.size())
                .filter(index -> USERS.get(index).getEmail().equals(user.getEmail()))
                .findFirst()
                .orElse(-1);
        if (userIndex > -1) {
            USERS.set(userIndex, user);
            return "The User is successfully updated";
        }
        return "There is not User with that email";
    }
    public User findUserByNameOfAccount(String nameOfAccount) {
        return USERS.stream()
                .filter(element -> element.getNameOfAccount().equals(nameOfAccount))
                .findFirst()
                .orElse(null);
    }
    public String deleteUser(String nameOfAccount) {
        var user = findUserByNameOfAccount(nameOfAccount);
        if (user != null) {
            USERS.remove(user);
            return "The User is successfully deleted";
        }
        return "The User is not successfully deleted";
    }
}
