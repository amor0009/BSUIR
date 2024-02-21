package com.example.test.service.Inpl;

import com.example.test.model.User;
import com.example.test.repository.InMemoryUserDAO;
import com.example.test.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryUserServiceImpl implements UserService {
    private final InMemoryUserDAO repository;
    @Override
    public List<User> findAllUsers() {
        return repository.findAllUsers();
    }
    @Override
    public String saveUser(User user) {
        return repository.saveUser(user);
    }
    @Override
    public String updateUser(User user) {
        return repository.updateUser(user);
    }
    @Override
    public User findUserByNameOfAccount(String nameOfAccount) {
        return repository.findUserByNameOfAccount(nameOfAccount);
    }
    @Override
    public String deleteUser(String nameOfAccount) {
        return repository.deleteUser(nameOfAccount);
    }
}
