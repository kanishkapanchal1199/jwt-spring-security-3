package com.jwt.demo.jwtspringsecurity3.service;


import com.jwt.demo.jwtspringsecurity3.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();

    public UserService()
    {
        store.add(new User(UUID.randomUUID().toString(),"kanishka panchal", "kanishka.panchal123@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"riya shah", "riya123@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"swati patel", "swatipatel123@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"aarti prajapati", "aartiprajapati123@gmail.com"));
    }

    public List<User> getUsers()
    {
        return this.store;
    }


}
