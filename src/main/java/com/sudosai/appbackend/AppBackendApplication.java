package com.sudosai.appbackend;

import com.sudosai.appbackend.entity.Authority;
import com.sudosai.appbackend.entity.User;
import com.sudosai.appbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AppBackendApplication {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(AppBackendApplication.class, args);
    }

    @PostConstruct
    protected void init() {
        List<Authority> authorityList = new ArrayList<>();
        authorityList.add(new Authority("USER"));
        authorityList.add(new Authority("ADMIN"));

        User user = new User(
                "john",
                "john@gmail.com",
                passwordEncoder.encode("123"),
                authorityList
        );

        userRepository.save(user);
    }
}
