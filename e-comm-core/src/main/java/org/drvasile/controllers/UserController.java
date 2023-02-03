package org.drvasile.controllers;

import java.util.Collection;
import java.util.Collections;

import org.drvasile.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController
{
    @GetMapping
    public Collection<User> getUsers()
    {
        return Collections.emptyList();
    }
}
