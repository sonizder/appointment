package com.service;


import com.dao.IBaseDao;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by soner.ustel on 02/04/2017.
 */
@Service
public class AuthenticationService implements UserDetailsService{


    @Autowired
    IUserService userService;

    @Autowired
    IBaseDao baseDao;


    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User user = userService.getWithEmail(s);
        if(user==null){
            throw new UsernameNotFoundException(s);
        }

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getPassword(), getGrantedAuthorities(user));

        return userDetails;
    }

    private List<GrantedAuthority> getGrantedAuthorities(User user) {
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>(1);
        grantedAuthorityList.add(new SimpleGrantedAuthority(user.getRole()));
        return grantedAuthorityList;
    }
}
