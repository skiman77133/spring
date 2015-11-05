package com.alex.security;

import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.List;

import com.alex.exception.AuthentificationException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
 
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthentificationException{
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();
 
        
        // use the credentials to try to authenticate against the third party system
        if (true) {
            List<GrantedAuthority> grantedAuths = new ArrayList();
            return new UsernamePasswordAuthenticationToken(name, password, grantedAuths);
        } else {
            throw new AuthentificationException("Unable to auth against third party systems");
        }
        
    }
 
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
