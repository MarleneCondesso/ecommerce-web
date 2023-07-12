package com.ecommerce.ecommerceweb.service;

import com.ecommerce.ecommerceweb.model.AuthenticationToken;
import com.ecommerce.ecommerceweb.model.User;
import com.ecommerce.ecommerceweb.repository.AuthenticationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationTokenService {

    @Autowired
    AuthenticationTokenRepository authenticationTokenRepository;

    public void createAutenticationToken(User user){

        AuthenticationToken authenticationToken = new AuthenticationToken(user);

        authenticationTokenRepository.save(authenticationToken);
    }

    public AuthenticationToken readAuthenticationTokenByUser(User user){
        return authenticationTokenRepository.findByUser(user);
    }

}
