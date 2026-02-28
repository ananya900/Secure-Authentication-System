package com.example.secureauth.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.secureauth.model.User;
import com.example.secureauth.repository.UserRepository;

@Service
public class AuthService {

    private final UserRepository repo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public AuthService(UserRepository repo) {
        this.repo = repo;
    }

    public String signup(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
        return "Signup successful";
    }

    public String login(User user) {
        User dbUser = repo.findById(user.getUsername()).orElse(null);

        if (dbUser == null) return "User not found";

        if (encoder.matches(user.getPassword(), dbUser.getPassword()))
            return "Login successful";

        return "Invalid credentials";
    }
}
