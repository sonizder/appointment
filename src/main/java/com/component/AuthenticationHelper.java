package com.component;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 * Created by soner.ustel on 29/04/2017.
 */
@Component
public class AuthenticationHelper {

    public Authentication getAuthentication(){
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public boolean isUserLogin(){
        Authentication authentication = getAuthentication();
        return !(authentication instanceof AnonymousAuthenticationToken);
    }

}
