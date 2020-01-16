package com.spring.springrestclientexamples.services;

import com.spring.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
