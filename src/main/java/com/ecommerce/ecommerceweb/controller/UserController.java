package com.ecommerce.ecommerceweb.controller;

import com.ecommerce.ecommerceweb.lib.api.ApiResponseSignInUser;
import com.ecommerce.ecommerceweb.lib.api.ApiResponseSignUpUser;
import com.ecommerce.ecommerceweb.model.SignIn;
import com.ecommerce.ecommerceweb.model.SignUp;
import com.ecommerce.ecommerceweb.repository.UserRepository;
import com.ecommerce.ecommerceweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ApiResponseSignUpUser signUp(@RequestBody SignUp signUp){
        return userService.signUp(signUp);
    }

    @PostMapping("/signin")
    public ApiResponseSignInUser signIn(@RequestBody SignIn signIn) {
        return userService.signIn(signIn);
    }
}
